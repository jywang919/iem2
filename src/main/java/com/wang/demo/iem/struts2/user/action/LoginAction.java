package com.wang.demo.iem.struts2.user.action;

public class LoginAction {

	private static int loginCount = 0;
	

	public int getLoginCount() {
		return loginCount;
	}


	public String execute() {
		loginCount ++;
		return "success";
	}
}
