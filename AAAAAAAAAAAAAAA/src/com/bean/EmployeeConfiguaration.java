package com.bean;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeConfiguaration
{
	public static void main(String[] args) 
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction	tx = session.beginTransaction();
		EmployePojo emp = new EmployePojo();
		emp.setEmployeeName("Ganesh");
		emp.setEmployeeAge(26);
		emp.setEmployeeSalary(50000);
		
		EmployePojo emp1 = new EmployePojo();
		emp1.setEmployeeName("mahesh");
		emp1.setEmployeeAge(28);
		emp1.setEmployeeSalary(20000);
		
		EmployePojo emp2 = new EmployePojo();
		emp2.setEmployeeName("sushma");
		emp2.setEmployeeAge(25);
		emp2.setEmployeeSalary(65000);
		session.save(emp2);
		
		
		EmployePojo emp3 = new EmployePojo();
		emp3.setEmployeeAge(26);
		emp3.setEmployeeName("shyamala");
		emp3.setEmployeeSalary(36000);
		
		
		
		EmployePojo emp4 = new EmployePojo();
		emp4.setEmployeeAge(26);
		emp4.setEmployeeName("narasimha");
		emp4.setEmployeeSalary(1000000);
		
		List<EmployePojo> li= new ArrayList<EmployePojo>();
		li.add(emp);
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		li.add(emp4);
		session.save(emp);
		tx.commit();
		System.out.println("inserted");
		session.close();
		sf.close();		
	}	
}
