package com.youtube2.jwt.entity;

import javax.persistence.Id;

public class JwtRequest {
    
    private String email;
    private String userPassword;
    
	
	
	public String getUserPassword() {
		return userPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

  
}
