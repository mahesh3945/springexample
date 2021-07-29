<%@page language="java"  pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!Connection con=null;
Statement st=null;
%>
<form action="updateinfo.jsp">

EmpCode:<select name="eid">
<%
String driver=application.getInitParameter("drivername");
String url=application.getInitParameter("url");
String username=application.getInitParameter("username");
String password=application.getInitParameter("password");

Class.forName(driver);
con=DriverManager.getConnection(url, username,password);

st=con.createStatement();

ResultSet rs=st.executeQuery("select eid from empdetails");

while(rs.next())
{
String id=rs.getString(1);	
%>

<option><%=id %></option>

<%
}
%>
</select><br>
<input type=submit value=Update>
</form>
</body>
</html>