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
Configuration config = new Configuration();
config.configure("hibernate.cfg.xml");
SessionFactory sft = config.buildSessionFactory();
Session session = sft.openSession();
Transaction tx = session.beginTransaction();
ProductPojo pp= new ProductPojo();
pp.setProductName("LapTop");
pp.setProductCost(55555);
pp.setProductMdate("22/02/1888");	
System.out.println("records inserted..");

session1.save(pp);
tx.commit();
session1.close();		
sft.close();
%>
</body>
</html>