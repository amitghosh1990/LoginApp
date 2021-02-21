package com.org.amit.sampleLogin.exception;

public class EmptyPasswordException extends RuntimeException{
	
	private static final long serialVersionUID = 1955311587246231238L;

	public EmptyPasswordException(String message) {
		super(message);
	}

}
