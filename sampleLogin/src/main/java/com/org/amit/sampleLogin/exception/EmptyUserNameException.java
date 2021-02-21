package com.org.amit.sampleLogin.exception;

/**
 * @author AMIT
 *
 */

public class EmptyUserNameException extends RuntimeException {

	private static final long serialVersionUID = 2780581371935851246L;

	public EmptyUserNameException(String message) {
		super(message);
	}
}
