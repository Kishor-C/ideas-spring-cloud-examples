package com.example.configclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class DatasourceConfig {

	@Value("${spring.datasource.title: some dummy value}")
	private String title;
	
	@Value("${spring.datasource.username: some dummy username}")
	private String username;

	public String getTitle() {
		return title;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "DatasourceConfig [title=" + title + ", username=" + username + "]";
	}
	
	
}
