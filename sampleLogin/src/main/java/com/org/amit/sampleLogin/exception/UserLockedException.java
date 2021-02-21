package com.org.amit.sampleLogin.exception;

/**
 * @author AMIT
 *
 */

public class UserLockedException extends RuntimeException{

	private static final long serialVersionUID = -742858196267659743L;
	
	public UserLockedException(String message){
		super(message);
		
	}

}
