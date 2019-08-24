package com.wang.demo.iem.struts2.user.action;

public class WelcomeAction{

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