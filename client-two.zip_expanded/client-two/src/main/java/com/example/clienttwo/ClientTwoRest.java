package com.example.clienttwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client-two")
public class ClientTwoRest {

	@Autowired
	private ClientTwoService service;
	
	@GetMapping
	public String defaultGreetingsFromClientTwo() {
		return service.fetchDefaultGreetings();
	}
}
