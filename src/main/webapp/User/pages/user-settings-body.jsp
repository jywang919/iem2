<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Settings</title>
</head>
<body>

<%
    request.getSession().setAttribute( "BackURL", request.getRequestURL().toString() + "?" + request.getQueryString() );
%>
<table bgcolor="#E9E9E9" border=0 width="100%" height="100%" cellpadding=5 cellspacing=0 class="body">
	<tr><td>
		<table width="100%" border=0 cellpadding="5" cellspacing="0" bordercolor="#FFFFFF" bgcolor="#E9E9E9">
			<tr> <td colspan=2 valign=top bgcolor="#E9E9E9"><div align="left">
				<a href="changepassword.action">Change Password</a> 
			</div></td></tr>
			<tr><td>
				<table border=0 width="100%" cellpadding=2 cellspacing=2>
						<tr><td><div align="right">
								Login Name: <s:property value = "loginName"/></div>
							</td></tr>
							<tr><td><div align="right">First Name: <s:property value = "firstName"/></div>
							</td></tr>
						<tr><td><div align="right">Last Name: <s:property value = "lastName"/></div>	
						</td></tr>
	                    <tr><td><div align="right">Email Address: <s:property value = "email"/></div>
	                    </td></tr>
	                    <tr><td><div align="right">SmartCard DN:  <s:property value = "smartCardDn"/></div>
	                    </td></tr>
	             </table>
             </td></tr>		
		</table>
	</td></tr>
	<tr><td>
		<table width="100%" border=0>
				<tr class="graytab"><td align="left">
						<b><s:property value = "loginName"/></b> is assigned to the following <b>Groups</b>:
				</td></tr>
				<tr><td>
				<div class="scroll">
		            <s:iterator value = "groups">
		                  <html:multibox disabled="true" property="selectedUserGroupCodes" >
					      		<s:property value = "code"/>
					      </html:multibox>
		                  <s:property value = "code"/> - <s:property value = "description"/><br>
		            </s:iterator>
		            </div>
		            </td></tr>
	      </table>		
     </td></tr>
</table>		

</body>
</html>