package com.example.clienttwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ClientTwoService {

	@Autowired
	private RestTemplate restTemplate;

	@CircuitBreaker(name = "fetchDefaultService", 
			fallbackMethod = "buildFallbackFetchefaultGreetings")
	public String fetchDefaultGreetings() {
		System.out.println("::::::::: Making request to remote service ::::::::::");
		String message = null;
		message = restTemplate.getForObject("http://CLIENT-ONE/client-one", String.class);
		return message;
	}
	
	// fallback method must have same return type but an extra parameter of Throwable 
	// can be provided
	public String buildFallbackFetchefaultGreetings(Throwable t) {
		System.err.println(":::::::: FallbackForGreetings :::::::"+t.toString());
		return "Alternative response from fallback";
	}
	
	
}
