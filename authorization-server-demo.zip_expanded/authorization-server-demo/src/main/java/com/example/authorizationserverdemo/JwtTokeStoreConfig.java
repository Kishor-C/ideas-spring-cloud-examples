package com.example.authorizationserverdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class JwtTokeStoreConfig {

	// instance that has a signature key
	@Autowired
	private ServiceConfig serviceConfig;

	@Bean
	public JwtAccessTokenConverter tokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey(serviceConfig.getSignature());
		return converter;
	}
	// token store is a persistence interface
	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(tokenConverter());
	}
}
