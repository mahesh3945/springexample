package com.bean;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMainFor {

	public static void main(String[] args)	
	{
		Scanner sc = new Scanner(System.in);
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction	tx = session.beginTransaction();
		for(int i=1;i<=5;i++)
		{			
			System.out.println("Enter employee name:");
			String str= sc.next();
			System.out.println("Enter employee age");
			int age= sc.nextInt();
			System.out.println("Enter employee sal:");
			int sal=sc.nextInt();
	
			EmployePojo em = new EmployePojo();
			em.setEmployeeName(str);
			em.setEmployeeAge(age);
			em.setEmployeeSalary(sal);		
			session.save(em);		
		}
		tx.commit();
		}
}
