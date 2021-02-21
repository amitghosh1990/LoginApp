package com.org.amit.sampleLogin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.org.amit.sampleLogin.model.UserLogin;

/**
 * @author AMIT
 *
 */

@Repository
public interface LogInDao extends CrudRepository<UserLogin, String>{
	
}
