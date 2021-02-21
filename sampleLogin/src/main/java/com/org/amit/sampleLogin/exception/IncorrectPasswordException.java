package com.org.amit.sampleLogin.exception;

public class IncorrectPasswordException extends RuntimeException {

	private static final long serialVersionUID = -5732290998483366340L;

	public IncorrectPasswordException(String message) {
		super(message);
	}

}
