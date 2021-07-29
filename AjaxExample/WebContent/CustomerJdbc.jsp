<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
PreparedStatement pst = con.prepareStatement("select * from  dept where deptno = ? ");
String dep = request.getParameter("deptId");
pst.setString(1, dep);
ResultSet rs =pst.executeQuery();
ResultSetMetaData rsmd = rs.getMetaData();
if(rs.next())
{
	out.print("<table border=1 bgcolor=green>");
	for(int i=1;i<rsmd.getColumnCount();i++)
	{
		out.println("<th>"+rsmd.getColumnName(i)+"</th>");
	}
		out.println("<tr>");
	for(int i=1;i<rsmd.getColumnCount();i++)
	{
		out.println("<td>"+rs.getString(i)+"</td>");
	}
	
 out.print("</tr></table>");	
}
else
{
	out.print("No Customer Exist With This Department Id");	
}
%>
</body>
</html>