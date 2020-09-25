package com.wang.demo.iem.struts2.user.interceptor;

//import org.apache.log4j.Logger;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
public class LoggerInterceptor  implements Interceptor {
	private Logger logger;  
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String className = invocation.getAction().getClass().getName();
		 logger= LoggerFactory.getLogger(className);
		 
		long startingTime = System.currentTimeMillis();
		logger.error("Before calling action: " + className);
//		System.out.println("Before calling action: " + className);

		String result = invocation.invoke();

		long endingTime = System.currentTimeMillis();

//		System.out.println("After calling action: " + className	+ " Time taken: " + (endingTime - startingTime) + " ms");
		logger.error("After calling action: " + className+ " Time taken: " + (endingTime - startingTime) + " ms");
		return result;
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
