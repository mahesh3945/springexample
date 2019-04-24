package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		
		
		employeeService.getEmployee().setName("Pankaj");
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		System.out.println(employeeService.getEmployee().getName());
		//employeeService.getEmployee().throwException();
		System.out.println("-*-*-*-*-*--*-*-*-*-");
		employeeService.getMessage("Haii");
		System.out.println("/*/*/*/*/*/*/*/*/*");
		System.out.println(employeeService.getStudent());
				
		
		
		ctx.close();
	}
}