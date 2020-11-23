package com.example.mysecondspringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestApi {

	@GetMapping
	public String getMessage() {
		return "Hello Rest";
	}
}
