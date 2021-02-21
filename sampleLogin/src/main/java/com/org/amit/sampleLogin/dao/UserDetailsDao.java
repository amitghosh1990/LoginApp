package com.org.amit.sampleLogin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.amit.sampleLogin.model.UserDetails;

@Repository
public interface UserDetailsDao extends CrudRepository<UserDetails, String>{

}
