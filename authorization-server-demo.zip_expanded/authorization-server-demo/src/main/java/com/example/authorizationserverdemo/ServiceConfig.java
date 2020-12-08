package com.example.authorizationserverdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {

	@Value("${signature.key}")
	private String signature = "";

	public String getSignature() {
		return signature;
	}
	
	
}
