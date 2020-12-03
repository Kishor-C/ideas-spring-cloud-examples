package com.example.walletmicroserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet")
public class WalletController {

	@Autowired
	private WalletService service;
	
	@GetMapping(value = "{accNum}/{amount}")
	public Wallet addAmountToWalletApi(@PathVariable("accNum") int accNum, @PathVariable("amount") double amount) {
		return service.addAmountToWallet(accNum, amount);
	}
	
	@GetMapping("{name}")
	public String getMessageApi(@PathVariable("name") String name) {
		return service.getMessage(name);
	}
}
