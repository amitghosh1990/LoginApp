package com.org.amit.sampleLogin.exception;

/**
 * @author AMIT
 *
 */

public class UserNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -7236050206077667660L;

	public UserNotFoundException(String message){
		super(message);
		
	}

}
