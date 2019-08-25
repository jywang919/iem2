package com.wang.demo.iem.struts2.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport{

    private final static String SUCCESS = "SUCCESS";
    private final static String FAILURE = "FAILURE";
    
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void validate() {
		
		//Action level error message
		if(username.trim().length() < 1 || password.trim().length() < 1)
			addActionError("Fields can't be blank");
		
		//Field level error message
		if(username.length() < 1)	addFieldError("username","username can not be blank");
		if(password.length() < 6)	addFieldError("password", "Password length must be greater than 5");
		

	}

	// all struts logic here
	public String execute() {
        if (null != this.getUsername() && null != this.getPassword()
        		&& this.getUsername().length() > 0 && this.getPassword().length() > 0
        		&& this.getUsername().equals(this.getPassword())) {
            return SUCCESS;
        }
		return FAILURE;

	}
}