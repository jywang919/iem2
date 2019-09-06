<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    request.getSession().setAttribute( "BackURL", request.getRequestURL().toString() + "?" + request.getQueryString() );
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Settings</title>
</head>
<body>

<table bgcolor="#E9E9E9" border=0 width="100%" height="100%" cellpadding=5 cellspacing=0 class="body">
	<tr><td>
		<table width="100%" border=0 cellpadding="5" cellspacing="0" bordercolor="#FFFFFF" bgcolor="#E9E9E9">
			<tr> <td colspan=2 valign=top bgcolor="#E9E9E9"><div align="left">
				<a href="changepassword.action">Change Password</a> 
			</div></td></tr>
			<tr><td>
	              <s:textfield id="loginNameId" name="loginName" label="Login ID"  cols="20" rows="1" />
	              <s:textfield name="firstName" label="First Name" cols="20" rows="1" />
	              <s:textfield name="lastName" label="Last Name" cols="20" rows="1" />
	              <s:textfield name="middleInitial" label="Middle Initial" cols="1" rows="1"/>
	              <s:textfield name="email" label="Email Address" cols="20" rows="1" />
	              <s:textfield name="distinguishedName" label="SmartCard DN" cols="50" rows="1" />   
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
			            <s:iterator value = "allUserGroups">
						        <s:if test="selectedUserGroupCodes == code">
						      		<s:checkbox theme="simple" cssStyle="border:0px" name="selectedUserGroupCodes" disabled="true" value="true" />
						      	</s:if>
						      	<s:else>
						      		<s:checkbox theme="simple" cssStyle="border:0px" name="selectedUserGroupCodes" disabled="true" value="false" />
						      	</s:else>
			                  	<s:property value = "code"/> - <s:property value = "description"/><br>
			            </s:iterator>
		            </div>
		            </td></tr>
	      </table>		
     </td></tr>
</table>		

</body>
</html>