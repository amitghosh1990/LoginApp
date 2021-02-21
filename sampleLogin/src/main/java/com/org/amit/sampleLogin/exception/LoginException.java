package com.org.amit.sampleLogin.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.org.amit.sampleLogin.service.MessageProperty;

/**
 * @author AMIT
 *
 */

@ControllerAdvice
public class LoginException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmptyUserNameException.class)
	public ResponseEntity<ErrorMessage> handleEmptyUserNameException(EmptyUserNameException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), MessageProperty.CONTACT_ADMINISTRATOR_INFO);
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(EmptyPasswordException.class)
	public ResponseEntity<ErrorMessage> handleEmptyPasswordException(EmptyPasswordException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), MessageProperty.CONTACT_ADMINISTRATOR_INFO);
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleRecordNotFoundException(UserNotFoundException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), MessageProperty.CONTACT_ADMINISTRATOR_INFO);
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(IncorrectPasswordException.class)
	public ResponseEntity<ErrorMessage> handleIncorrectPasswordException(IncorrectPasswordException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), MessageProperty.CONTACT_ADMINISTRATOR_INFO);
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserLockedException.class)
	public ResponseEntity<ErrorMessage> handleUserLockedException(UserLockedException ex) {
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(), MessageProperty.CONTACT_ADMINISTRATOR_INFO);
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.LOCKED);
	}

}
