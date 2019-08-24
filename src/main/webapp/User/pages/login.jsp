<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IEM Struts 2 Demo</title>
    </head>
<body>

<s:form action="Welcome">
	<s:textfield name="username" label="Username"/>
	<s:password name="password" label="Password"/>
	<s:submit value="Login"/>
</s:form>
<p>This is your <s:property value="loginCount" /> times logging in!</p>
</body>
</html>