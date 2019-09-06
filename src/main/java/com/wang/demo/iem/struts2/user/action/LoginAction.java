package com.wang.demo.iem.struts2.user.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.demo.iem.struts2.user.domain.Account;

public class LoginAction extends ActionSupport implements SessionAware{  

	private static int loginCount = 0;
	
    private final static String SUCCESS = "SUCCESS";
    private final static String FAILURE = "FAILURE";
    private final static String  START="START";
    
    private SessionMap<String,Object> sessionMap;  
    
	private String username;
	private String password;
	

	
	public int getLoginCount() {
		return loginCount;
	}
	
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
		if(null != username && null != password) {
			//Action level error message
			if(username.trim().length() < 1 || password.trim().length() < 1)
				addActionError("Fields can't be blank");
			
			//Field level error message
			if(username.length() < 1)	addFieldError("username","username can not be blank");
			if(password.length() < 1)	addFieldError("password", "Password length must be greater than 1");
		}
	}

	// all struts logic here
	public String execute() {
		loginCount ++;
		if(null == username && null == password) return START;
        if (null != this.getUsername() && null != this.getPassword()
        		&& this.getUsername().length() > 0 && this.getPassword().length() > 0
        		&& this.getUsername().equals(this.getPassword())) {
            storeLoginInSession();
            return SUCCESS;
        }
        
		return FAILURE;

	}
	
	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap)map;  
	}
	
	private void storeLoginInSession() {
		HttpSession session=ServletActionContext.getRequest().getSession();  
		   
	    sessionMap.put("login","true");  
	    sessionMap.put("name",this.getUsername());  
	}

	
}
