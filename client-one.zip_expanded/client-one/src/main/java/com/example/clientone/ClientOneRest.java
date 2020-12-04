package com.example.clientone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client-one")
public class ClientOneRest {

	@GetMapping
	public String defaultGreetings() {
		return "Welcome User! from client-one";
	}
	@GetMapping("{name}")
	public String greetingsWithName(@PathVariable String name) {
		return "Welcome "+name+"! from client-one";
	}
}
