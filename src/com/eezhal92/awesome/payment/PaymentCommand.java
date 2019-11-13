package com.eezhal92.awesome.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentCommand {
	private static Map<String, PayCommand> commands = new HashMap<>();

	public static void addCommand(String cmd, PayCommand command) {
		commands.put(cmd, command);
	}

	public static PayCommand getCommand(String cmd) {
		PayCommand command = commands.get(cmd);

		return command;
	}
}
