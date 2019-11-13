package com.eezhal92.awesome.payment;

public class GoPayCommand implements PayCommand {
	@Override
	public void execute(int amount) {
		PayByGoPay gopay = new PayByGoPay();

		gopay.collectPaymentDetails();
		gopay.pay(amount);
	}
}
