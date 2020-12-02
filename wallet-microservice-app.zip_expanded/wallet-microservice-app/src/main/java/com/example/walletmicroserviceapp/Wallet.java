package com.example.walletmicroserviceapp;

public class Wallet {
	private String username;
	private double amount;
	public Wallet() {
		this.amount = 1500;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
