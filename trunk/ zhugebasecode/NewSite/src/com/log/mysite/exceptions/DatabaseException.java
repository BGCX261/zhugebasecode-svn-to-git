package com.log.mysite.exceptions;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1383562451743773246L;

	public DatabaseException() {
		super();
	}

	public DatabaseException(String message) {
		super(message);
	}

	public DatabaseException(Throwable t) {
		this(t.toString(), t);
	}

	public DatabaseException(String message, Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}

}
