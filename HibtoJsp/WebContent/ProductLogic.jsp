<%@page import="pojo.ProductPojo"%>
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
		Transaction  tx = session1.beginTransaction();
		System.out.println("table Created");
		
		/*ProductPojo pp= new ProductPojo();
		pp.setProductName("LapTop");
		pp.setProductCost(55555);
		pp.setProductMdate("22/02/1888");	
		System.out.println("records inserted..");

		session1.save(pp);
		tx.commit();
		session1.close();	*/	
		//sft.close();
		


 %>
</body>
</html>