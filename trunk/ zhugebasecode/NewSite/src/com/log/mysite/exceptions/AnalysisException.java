package com.log.mysite.exceptions;

public class AnalysisException extends RuntimeException {

	private static final long serialVersionUID = -8633392855755528855L;

	public AnalysisException() {
		super();
	}

	public AnalysisException(String message) {
		super(message);
	}

	public AnalysisException(Throwable t) {
		this(t.toString(), t);
	}

	public AnalysisException(String message, Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}
}
