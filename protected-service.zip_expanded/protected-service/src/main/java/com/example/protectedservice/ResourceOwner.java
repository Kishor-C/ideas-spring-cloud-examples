package com.example.protectedservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceOwner extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {
		// match all the request that are authenticated
		//http.authorizeRequests().anyRequest().authenticated();
		
		http.authorizeRequests()
			.antMatchers(HttpMethod.DELETE, "/api/**")
			.hasRole("ADMIN")
			.anyRequest().authenticated();
	}

	
	
}
