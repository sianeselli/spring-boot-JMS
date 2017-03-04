package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import configurations.HelloWorldConfiguration;

import services.api.HelloWorldService;

@Controller
@EnableAutoConfiguration
@Import({HelloWorldConfiguration.class})
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return helloWorldService.getHelloMessage();
    }

}
