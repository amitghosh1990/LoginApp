/**
 * 
 */
package com.org.amit.sampleLogin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.amit.sampleLogin.dao.LogInDao;
import com.org.amit.sampleLogin.dao.UserDetailsDao;
import com.org.amit.sampleLogin.exception.*;
import com.org.amit.sampleLogin.model.UserDetails;
import com.org.amit.sampleLogin.model.UserLogin;

/**
 * @author AMIT
 *
 */

@Service
public class LoginService {

	@Autowired
	LogInDao logInDao;

	@Autowired
	UserDetailsDao userDetailsDao;

	public boolean validateUserLogin(UserLogin userLogin) {

		if (userLogin.getUserName().isEmpty())
			throw new EmptyUserNameException("Username field can not be empty");

		if (userLogin.getPassword().isEmpty())
			throw new EmptyPasswordException("Password field can not be empty");

		Optional<UserLogin> user = logInDao.findById(userLogin.getUserName());
		Optional<UserDetails> userStatus = userDetailsDao.findById(userLogin.getUserName());

		if (!user.isPresent())
			throw new UserNotFoundException("User Not Found");

		if (userStatus.isPresent()) {
			if (userStatus.get().getIsLocked() == 1) {
				throw new UserLockedException("Your account is Locked.");
			}
		}

		if (!user.get().getPassword().equals(userLogin.getPassword())) {
			if (!userStatus.isPresent()) {
				userDetailsDao.save(new UserDetails(userLogin.getUserName(), 0, 1));
				throw new IncorrectPasswordException("Wrong password");
			}
			if (userStatus.get().getFaildAttempt() < 2) {
				userDetailsDao.save(new UserDetails(userLogin.getUserName(), 0, userStatus.get().getFaildAttempt()+1));
				throw new IncorrectPasswordException("Wrong password");
			}
			userDetailsDao.save(new UserDetails(userLogin.getUserName(), 1, userStatus.get().getFaildAttempt()+1));
			throw new IncorrectPasswordException("Wrong password");
		}
		
		if(userStatus.isPresent() && userStatus.get().getIsLocked() == 0)
			userDetailsDao.deleteById(userLogin.getUserName());

		return true;

	}
}
