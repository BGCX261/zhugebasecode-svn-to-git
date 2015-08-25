package com.log.mysite.exceptions;

public class InvalidURLPatternException extends RuntimeException {

	private static final long serialVersionUID = 5077175934901563177L;
	
	public InvalidURLPatternException(String message){
		super(message);
	}
}
