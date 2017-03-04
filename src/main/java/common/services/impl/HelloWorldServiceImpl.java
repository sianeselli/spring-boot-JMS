package common.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import common.services.api.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Value("${name:World}")
	private String name;

	public String getHelloMessage() {
		return "Hello " + this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

}