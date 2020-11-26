package com.example.configclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication

public class ConfigClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientDemoApplication.class, args);
	}

}
