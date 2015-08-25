package com.log.mysite.exceptions;

public class SiteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SiteException() {
		super();
	}

	public SiteException(String message) {
		super(message);
	}

	public SiteException(Throwable t) {
		this(t.toString(), t);
	}

	public SiteException(String message, Throwable t) {
		super(message, t);
		this.setStackTrace(this.getStackTrace());
	}
}
