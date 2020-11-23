package com.ideas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestApi {

	@GetMapping(value = "/hello")
	public String greetings() {
		return "Hello Spring Boot";
	}
}
