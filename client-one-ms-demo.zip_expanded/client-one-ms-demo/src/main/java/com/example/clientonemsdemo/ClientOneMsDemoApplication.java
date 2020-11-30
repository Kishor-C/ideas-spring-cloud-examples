package com.example.clientonemsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientOneMsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientOneMsDemoApplication.class, args);
	}

}
