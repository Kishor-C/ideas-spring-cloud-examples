package com.example.mysecondspringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestApi {

	
	@Autowired
	private Message message;
	
	@GetMapping
	public String getMessage() {
		message.callMessage();
		return "Hello Rest";
	}
}
