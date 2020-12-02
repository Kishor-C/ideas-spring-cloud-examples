package com.example.accountmicroserviceapp;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public Transaction debit(int accountNumber, double amount) {
		System.out.println("----- debit from AccountService -----");
		Transaction transaction = new Transaction();
		transaction.setTransactionId(accountNumber * 2);
		transaction.setAmount(amount);
		transaction.setTime(LocalDateTime.now());
		return transaction;
	}
}
