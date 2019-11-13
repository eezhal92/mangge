package com.eezhal92.awesome.payment;

public interface PayStrategy {
	boolean pay(int paymentAmount);
	void collectPaymentDetails();
}
