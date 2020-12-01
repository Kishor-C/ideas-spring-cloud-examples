package com.example.microserviceconfigclientapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client-one")
public class MyRestApi {

	@Value("${title: This has taken default title}")
	private String message;
	
	@GetMapping
	public String getMessage() {
		return message;
	}
}
