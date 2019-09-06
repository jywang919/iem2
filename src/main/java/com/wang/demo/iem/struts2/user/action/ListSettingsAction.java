package com.wang.demo.iem.struts2.user.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wang.demo.iem.struts2.user.domain.Group;
import com.wang.demo.iem.struts2.user.domain.Account;

public class ListSettingsAction extends ActionSupport  implements  RequestAware, ModelDriven<Account> {

	private final static String SUCCESS = "SUCCESS";

	private final static String FAILURE = "FAILURE";
	
	private Account account;
	
	public String execute() {
		
		return SUCCESS;
	}
	
	public String changePassword() {
		return SUCCESS;
	}
	
	public Account getModel() {
		HttpSession session=ServletActionContext.getRequest().getSession();  
		account= new Account("Sid","Bacam",99,"NC");
		account.setLoginName((String)session.getAttribute("name"));
		account.setEmail("Sid.Baccam@iem.com");
		account.setSmartCardDn("iem001");
		Group grp = new Group();
		grp.setCode("001");
		grp.setDescription("Administration");
		
		account.getAllUserGroups().add(grp);
		
		grp = new Group();
		grp.setCode("100");
		grp.setDescription("Application user");
		account.getAllUserGroups().add(grp);
		
		account.setSelectedUserGroupCodes(grp.getCode());
		return account;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		HttpServletRequest req=ServletActionContext.getRequest();  
//		req.getSession().setAttribute( "BackURL", req.getRequestURL().toString() + "?" + req.getQueryString() );
	}
	
}