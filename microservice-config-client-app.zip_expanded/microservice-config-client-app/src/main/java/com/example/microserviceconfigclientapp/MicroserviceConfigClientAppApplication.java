package com.example.microserviceconfigclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceConfigClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigClientAppApplication.class, args);
	}

}
