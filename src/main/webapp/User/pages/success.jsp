<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IEM Struts 2 Demo</title>
    </head>
<body>
<h4>Login Success. Welcome <s:property value="username"/></h4>
	<a href="ListSettings.action">My Settings</a> 
	<h1>${username} - Jeff</h1>
	<a href="fileUploadAction.action">File Upload</a> 
</body>
</html>
