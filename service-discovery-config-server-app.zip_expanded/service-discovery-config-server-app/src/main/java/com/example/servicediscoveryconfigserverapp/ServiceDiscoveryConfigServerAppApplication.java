package com.example.servicediscoveryconfigserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryConfigServerAppApplication.class, args);
	}

}
