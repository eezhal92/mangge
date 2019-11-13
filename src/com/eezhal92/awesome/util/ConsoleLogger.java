package com.eezhal92.awesome.util;

public class ConsoleLogger extends LoggerStrategy {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	@Override
	public void info(String message) {
		String text = ANSI_BLUE + this.getLogText("info", message) + ANSI_RESET;
		System.out.println(text);
	}

	@Override
	public void warn(String message) {
		String text = ANSI_YELLOW+ this.getLogText("warn", message) + ANSI_RESET;
		System.out.println(text);
	}

	@Override
	public void error(String message) {
		String text = ANSI_RED+ this.getLogText("error", message) + ANSI_RESET;
		System.out.println(text);
	}

}
