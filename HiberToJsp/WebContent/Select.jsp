<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="pojo.ProductPojoo"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
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
Configuration configg = new Configuration();
configg.configure("hibernate.cfg.xml");
SessionFactory sft = configg.buildSessionFactory();
Session session1 = sft.openSession();
Transaction tx=session1.beginTransaction();

Query query = session1.createQuery("from ProductPojoo");
List<ProductPojoo> list1=query.list();

	out.println("<table border cellspacing=0><th> productId </th><th> productName </th><th>productcost</th>");
for (ProductPojoo productpojoo : list1)
{
	out.println("<tr><td align=center>"+productpojoo.getProductId()+"</td><td align=center>"+productpojoo.getProductName()+"</td><td align=center>"+productpojoo.getProductCost()+"</td></tr>");	
}
%>
</body>
</html>