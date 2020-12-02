package com.example.accountmicroserviceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService service;
	
	@GetMapping(value = "{accountNumber}/{amount}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Transaction debitApi(@PathVariable("accountNumber") int accountNumber, @PathVariable("amount") double amount) {
		return service.debit(accountNumber, amount);
	}
}
