package com.org.amit.sampleLogin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	private String userName;
	private int isLocked;
	private int faildAttempt;
	
	public UserDetails(){
		
	}

	public UserDetails(String userName, int isLocked, int faildAttempt) {
		super();
		this.userName = userName;
		this.isLocked = isLocked;
		this.faildAttempt = faildAttempt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(int isLocked) {
		this.isLocked = isLocked;
	}

	public int getFaildAttempt() {
		return faildAttempt;
	}

	public void setFaildAttempt(int faildAttempt) {
		this.faildAttempt = faildAttempt;
	}

}
