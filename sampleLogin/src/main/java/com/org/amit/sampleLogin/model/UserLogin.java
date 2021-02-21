package com.org.amit.sampleLogin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author AMIT
 *
 */

@Entity
@Table(name = "LOGIN")
public class UserLogin {

	@Id
	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
