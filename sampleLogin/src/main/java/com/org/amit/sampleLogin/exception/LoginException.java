package com.org.amit.sampleLogin.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LoginException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmptyUserNameException.class)
	public ResponseEntity<ErrorMessage> emptyUserNameException(EmptyUserNameException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), "Please contact administrator.");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(EmptyPasswordException.class)
	public ResponseEntity<ErrorMessage> emptyPasswordException(EmptyPasswordException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), "Please contact administrator.");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> recordNotFound(UserNotFoundException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), "Incorrect username");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(IncorrectPasswordException.class)
	public ResponseEntity<ErrorMessage> incorrectPassword(IncorrectPasswordException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), "Incorrect password.");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserLockedException.class)
	public ResponseEntity<ErrorMessage> userLocked(UserLockedException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), "Please contact administrator.");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.LOCKED);
	}

}
