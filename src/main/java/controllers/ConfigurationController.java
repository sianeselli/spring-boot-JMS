package controllers;

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

import services.api.HelloWorldService;

import configurations.HelloWorldConfiguration;

@Controller
@EnableAutoConfiguration
@Import({ HelloWorldConfiguration.class })
@RequestMapping("/config")
public class ConfigurationController {

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
