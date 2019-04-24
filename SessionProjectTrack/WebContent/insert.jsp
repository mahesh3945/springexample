<%@page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! Connection con=null;
Statement st=null;
%>

<%
//reading input  from html  form
String eid=request.getParameter("eid");
String name=request.getParameter("name");
String des=request.getParameter("des");
String basic=request.getParameter("basic");
String add=request.getParameter("add");

//reading context initial params  from web.xml
String driver=application.getInitParameter("drivername");
String url=application.getInitParameter("url");
String username=application.getInitParameter("username");
String password=application.getInitParameter("password");

Class.forName(driver);
con=DriverManager.getConnection(url, username,password);
st=con.createStatement();


int val=st.executeUpdate("insert into empdetails values("+Integer.parseInt(eid)+",'"+name+"','"+des+"',"+Double.parseDouble(basic)+",'"+add+"')");
if(val>0)
{
	out.println("Record inserted");
%>

<%@include file="index.html"%>	


<%
}	// if close
else
{
	out.println("error");
}
%>

</body>
</html>

