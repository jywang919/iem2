# Sample project demonstrates Struts 2 

- Clone the project into your eclipse workspace

		1.	 Convert it into a Maven:

			Right click on the project -> Configure -> Convert to Maven Project

		2.  Add a server run time

		3.	Add your local JRE to the project lib

- Test the project:
	
	Right click on the project -> Run As -> Run on Server 
	
	Copy this URL to the browser: http://localhost:8080/iem2
	
	The browser will show the login page
	
	Type same in the user name and password will direct to a welcome page
	
	otherwise, a failure page will be displayed
	
- More than one submit buttons in one form
	1.	add <constant name="struts.mapper.action.prefix.enabled" value="true" /> to struts.xml
	2.	buttons in the form e.g.:
		<s:form>
			<s:submit action="Login" value="Login"/>
			<s:submit action="changepassword" value="Change Password"/>
			
- Error: Unexpected Exception caught setting 'junkField' on 'class com.wang.demo.iem.struts2.user.action.LoginAction: Error setting expression 'junkField' with value ['123', ]
	cause login.jsp has a junkField but LoginAction does not have this parameter