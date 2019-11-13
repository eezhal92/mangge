package com.eezhal92.awesome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.eezhal92.awesome.payment.GoPayCommand;
import com.eezhal92.awesome.payment.PayCommand;
import com.eezhal92.awesome.payment.PaymentCommand;
import com.eezhal92.awesome.payment.UserBalanceCommand;
import com.eezhal92.awesome.util.ConsoleLogger;

public class Main {
	private final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		ConsoleLogger logger = new ConsoleLogger();
		logger.info("Welcome to Cashier...");

		User user = Authenticator.authenticate();

		PaymentCommand.addCommand("1", new GoPayCommand());
		PaymentCommand.addCommand("2", new UserBalanceCommand(user));

		System.out.println("Choose your payment method:");
		System.out.println("1) gopay");
		System.out.println("2) user balance");
		System.out.print("Your choice:");

		String chosen = null;

		try {
			chosen = READER.readLine();
		} catch (IOException e) {

		}

		PayCommand cmd = PaymentCommand.getCommand(chosen);
		cmd.execute(5000);
	}
}
