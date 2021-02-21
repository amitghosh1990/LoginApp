package com.org.amit.sampleLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.amit.sampleLogin.model.UserLogin;
import com.org.amit.sampleLogin.service.LoginService;
import com.org.amit.sampleLogin.service.MessageProperty;

/**
 * @author AMIT
 *
 */

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "/login", consumes = "application/json")
	public ResponseEntity submitLoginDetails(@RequestBody UserLogin userLogin) {
		if (loginService.validateUserLogin(userLogin))
			return new ResponseEntity("Hi, "+ userLogin.getUserName(), HttpStatus.OK);
		else
			return new ResponseEntity(MessageProperty.GLOBAL_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
