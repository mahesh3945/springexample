<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft = config.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tx=session.beginTransaction();
		/*Query query=session.createQuery("update ProductPojo  as P set P.productCost= ? ");
		query.setInteger(0, 1000);
		
		int result=query.executeUpdate();
		tx.commit();
		System.out.println(result + "records Updated");*/
		Query query =session.createQuery("delete from ProductPojo as p where p.productMdate like '2%' ");
		int result=query.executeUpdate();
		tx.commit();
		System.out.println("record deleted");
		
		
	}

}

</body>
</html>