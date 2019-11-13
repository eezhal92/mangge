package com.eezhal92.awesome.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class LoggerStrategy {
	public void info(String message) {
		throw new UnsupportedOperationException("not implemented");
	}

	public void warn(String message) {
		throw new UnsupportedOperationException("not implemented");
	}

	public void error(String message) {
		throw new UnsupportedOperationException("not implemented");
	}

	protected String getCurrentTime() {
		Date d = new Date();

		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
	}

	protected String getLogText(String level, String message) {
		return "[" + level + "]" + getCurrentTime() + "-" + message;
	}
}
