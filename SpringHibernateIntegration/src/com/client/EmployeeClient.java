package com.client;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.Employee;

import com.services.EmployeeService;
public class EmployeeClient {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	EmployeeService service=(EmployeeService)context.getBean("employeeService");
	//List<Employee> lisEmployee=new ArrayList<Employee>();
	Set<Employee> lisemployee = new HashSet<Employee>();
	for(int i=1;i<=3;i++)
	{ 
		System.out.println("Enter employee name:");
		String str= sc.next();
		System.out.println("Enter employee age");
		int age= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee Address:");
		String addres=sc.nextLine();
		System.out.println("Enter employee Salary:");
		long salary =sc.nextLong();
	
		Employee employee= new Employee();	
		employee.setEmpName(str);
		employee.setEmpAge(age);
		employee.setEmpAddress(addres);
		employee.setSalary(salary);
		lisemployee.add(employee);
	}
	service.addEmployee(lisemployee);
	System.out.println("Records Inserted Successfully");
	sc.close();
	context.close();
	}
}
