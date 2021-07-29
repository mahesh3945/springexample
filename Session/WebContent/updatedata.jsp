<%@ page  import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!Connection con=null;
PreparedStatement pst=null;
%>
<%
String driver=application.getInitParameter("drivername");
String url=application.getInitParameter("url");
String username=application.getInitParameter("username");
String password=application.getInitParameter("password");

Class.forName(driver);
con=DriverManager.getConnection(url, username,password);

pst=con.prepareStatement("update empdetails set ename=?,designation=?,basic=?,address=? where eid=?");

String name=request.getParameter("ename");
String designation=request.getParameter("desi");
int sal=Integer.parseInt(request.getParameter("basic"));
String address=request.getParameter("add");


pst.setString(1,name );
pst.setString(2,designation );
pst.setInt(3,sal );
pst.setString(4,address);

String id=(String)session.getAttribute("eid");

pst.setInt(5,Integer.parseInt(id) );
int val=pst.executeUpdate();

if(val>0)
{
	out.print("Updated successfully");
}

%>

</body>
</html>