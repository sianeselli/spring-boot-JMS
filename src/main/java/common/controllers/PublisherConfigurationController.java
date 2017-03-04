package common.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import common.configurations.PublisherConfiguration;
import common.services.api.HelloWorldService;

@Controller
@EnableAutoConfiguration
@Import({ PublisherConfiguration.class })
@RequestMapping("/${service.root.path:}/config")
public class PublisherConfigurationController {

	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping(value = "/name", method = RequestMethod.POST)
	@ResponseBody
	public String updateName(@RequestBody String name) {
		helloWorldService.setName(name);
		return helloWorldService.getHelloMessage();
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<String> loadAll() {
		return new ArrayList<String>();
	}

}
