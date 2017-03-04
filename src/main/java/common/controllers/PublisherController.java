package common.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import common.configurations.PublisherConfiguration;
import common.services.api.HelloWorldService;

@Controller
@EnableAutoConfiguration
@Import({PublisherConfiguration.class})
public class PublisherController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping("${service.root.path:}/")
    @ResponseBody
    String home() {
        return helloWorldService.getHelloMessage();
    }

}
