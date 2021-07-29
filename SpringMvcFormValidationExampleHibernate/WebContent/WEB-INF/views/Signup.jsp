<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.error { 
		color: green; font-weight: bold; 
	}
</style>
</head>
<body>

<div align="center">

<table border="0" width="90%">
	<form:form action="Signup" commandName="userForm">
			<tr>
					<td>First Name : </td>
					<td><form:input path="firstName" size="30"/></td>
					<td><form:errors path="firstName" cssClass="error"/></td>
			</tr>
			<tr>
					<td>Last Name : </td>
					<td><form:input path="lastName" size="30"/></td>
					<td><form:errors path="lastName" cssClass="error"/></td>
			</tr>
			<tr>
					<td>Email: </td>
					<td><form:input path="email" size="30"/></td>
					<td><form:errors path="email" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><form:password path="password" size="30"/></td>
					<td><form:errors path="password" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Mobile Number:</td>
					<td><form:input path="mobileNumber" size="30"/></td>
					<td><form:errors path="mobileNumber" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Gender: </td>
					<td><form:input path="gender" size="30"/></td>
					<td><form:errors path="gender" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Date Of Birth: </td>
					<td><form:input path="dob" size="30"/>
					(dd-mm-yy)</td>
					<td><form:errors path="dob" cssClass="error"/></td>
				</tr>
				<tr>
				<td>
				<input type="submit" value="signUp"><br>
				Already have an account?<a href="/login"> Sign in</a> 
				</td>	
				</tr>
		
	</form:form>
		</table>
		
	</div>
</body>
</html>
