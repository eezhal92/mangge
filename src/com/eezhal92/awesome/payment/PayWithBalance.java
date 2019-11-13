package com.eezhal92.awesome.payment;

import com.eezhal92.awesome.User;

public class PayWithBalance implements PayStrategy {
	private User user;

	public PayWithBalance(User user) {
		this.user = user;
	}

	@Override
	public boolean pay(int paymentAmount) {
		this.user.deductBalance(paymentAmount);
		return true;
	}

	@Override
	public void collectPaymentDetails() {

	}
}
