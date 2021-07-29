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
<%
String driver=application.getInitParameter("drivername");
String url=application.getInitParameter("url");
String username=application.getInitParameter("username");
String password=application.getInitParameter("password");


Class.forName(driver);
con=DriverManager.getConnection(url, username,password);
st=con.createStatement();

String id=request.getParameter("eid");

ResultSet rs=st.executeQuery("select * from empdetails where eid="+Integer.parseInt(id));
if(rs.next())
{
	session.setAttribute("eid", id);
%>
<form action="updatedata.jsp">
<table align=center>
<tr><td>Name:</td><td><input type=text name="ename" value=<%=rs.getString(2)%>></td></tr>
<tr><td>Designation :</td><td><input type=text name="desi" value=<%=rs.getString(3)%>></td></tr>
<tr><td>basic:</td><td><input type=text name="basic" value=<%=rs.getString(4)%>></td></tr>
<tr><td>address:</td><td><input type=text name="add" value=<%=rs.getString(5)%>></td></tr>
<tr><td></td><td><input type=submit value="update"></td></tr>
</table>
</form>
<%} %>

</body>
</html>