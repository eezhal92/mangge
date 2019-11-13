package com.eezhal92.awesome.payment;

import com.eezhal92.awesome.User;

public class UserBalanceCommand implements PayCommand {
	public User user;

	public UserBalanceCommand(User user) {
		this.user = user;
	}

	@Override
	public void execute(int amount) {
		user.deductBalance(amount);
		System.out.println("user balance is: " + user.getBalance());
	}
}
