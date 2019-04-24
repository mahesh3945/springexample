<%@page import="java.sql.*" %>
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

ResultSet rs=st.executeQuery("select eid,ename from empdetails");
ResultSetMetaData md=rs.getMetaData();
%>


<table width="50%"  bgcolor="yellow" border="5" cellspacing="0" cellpadding="5" align=center>
<%
for(int i=1;i<=md.getColumnCount();i++)
{
%>	
<th><%=md.getColumnName(i).toUpperCase()%></th>	

<%
}
while(rs.next())
{
%>
<tr>
<%
for(int i=1;i<=md.getColumnCount();i++)
{
%>
<td align="center"><%=rs.getString(i)%></td>
<%	
}//  for close
%>
</tr>
<%
}//while  close
%>
</table>
</body>
</html>