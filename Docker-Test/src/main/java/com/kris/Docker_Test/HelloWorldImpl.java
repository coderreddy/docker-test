package com.kris.Docker_Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldImpl implements HelloWorld{

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	public String getMessage(String name) {
		return "This is the Dockerized message "+ name;
	}

}
