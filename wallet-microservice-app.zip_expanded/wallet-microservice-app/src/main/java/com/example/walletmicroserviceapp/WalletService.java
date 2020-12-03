package com.example.walletmicroserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WalletAccountClient walletAccountClient;
	
	public Wallet addAmountToWallet(int accountNumber, double amount) {
		Wallet wallet = new Wallet();
		Transaction tx = restTemplate.getForObject("http://ACCOUNT-SERVICE-APP/account/"+accountNumber+"/"+amount,  Transaction.class);
		wallet.setAmount(wallet.getAmount() + tx.getAmount());
		wallet.setUsername("Alexandar");
		return wallet;
	}
	
	public String getMessage(String name) {
		String message = null;
		message = walletAccountClient.getGreetingsContent(name);
		return message;
	}
}
