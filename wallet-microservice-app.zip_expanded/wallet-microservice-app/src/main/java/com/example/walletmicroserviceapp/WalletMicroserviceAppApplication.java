package com.example.walletmicroserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WalletMicroserviceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletMicroserviceAppApplication.class, args);
	}
	
	// since wallet service communicates with the account service we need
	// Loadbalancer aware RestTemplate
	// @LoadBalanced creates the client side load balancer
	// it looks for the logical name of the remote service instead of physical location
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
