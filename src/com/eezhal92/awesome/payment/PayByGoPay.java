package com.eezhal92.awesome.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByGoPay implements PayStrategy {
	private static final Map<String, String> DATABASE = new HashMap<>();
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private String email;
	private String password;
	private boolean isSignedIn;

	static {
		DATABASE.put("mypassword", "john@gmail.com");
		DATABASE.put("yourpassword", "jane@gmail.com");
	}

	private void setSignedIn(boolean isSignedIn) {
		this.isSignedIn = isSignedIn;
	}

	private boolean verify() {
		setSignedIn(email.equals(DATABASE.get(password)));

		return isSignedIn;
	}

	@Override
	public boolean pay(int paymentAmount) {
		if (isSignedIn) {
			System.out.println("Do remote request paying with amount: " + paymentAmount);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void collectPaymentDetails() {
		try {
			while (!isSignedIn) {
				System.out.print("Enter your gopay email:");
				email = READER.readLine();
				System.out.print("Enter your password:");
				password = READER.readLine();

				if (verify()) {
					System.out.println("Data verification has been successful.");
				} else {
					System.out.println("Cannot sign you in.");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
