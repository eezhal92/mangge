package com.eezhal92.awesome;

public class User {
	private String username;
	private String password;
	private int balance;

	public User(String username, String password, int balance) {
		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void deductBalance(int amount) {
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}
}
