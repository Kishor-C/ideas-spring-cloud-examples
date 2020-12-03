package com.example.walletmicroserviceapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ACCOUNT-SERVICE-APP")
public interface WalletAccountClient {

	// it makes request to the ACCOUNT-SERVICE-APP/account/{name} and gets a String response	
	@GetMapping("account/{name}")
	public String getGreetingsContent(@PathVariable("name") String name);
}
