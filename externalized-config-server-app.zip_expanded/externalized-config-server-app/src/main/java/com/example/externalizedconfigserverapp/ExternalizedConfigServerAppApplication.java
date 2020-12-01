package com.example.externalizedconfigserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ExternalizedConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalizedConfigServerAppApplication.class, args);
	}

}
