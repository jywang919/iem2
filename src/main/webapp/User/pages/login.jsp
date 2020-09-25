<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IEM Struts 2 Demo</title>
    </head>
<body>

<s:actionerror/>
<s:form action="Login">
	<s:hidden name="junkField" value="123" />
	<s:textfield name="username" label="Username"/>
	<s:password name="password" label="Password"/>
	<s:submit action="Login" value="Login" />
	<s:submit action="changepassword" value="change password"/>
	<%-- 
	<s:submit action="changepassword" value="Change Password"/>
	--%>
	<s:form action="changepassword">
		<s:submit  value="Change Password form"/>
	</s:form>
</s:form>
<p>This is your <s:property value="loginCount" /> times logging in!</p>
</body>
</html>
