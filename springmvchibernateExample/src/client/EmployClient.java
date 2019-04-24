package client;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.services.EmployeeService;

public class EmployClient {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("sdnext-servlet.xml");
	EmployeeService service=(EmployeeService)context.getBean("employeeService");
	for(int i=1;i<=5;i++)
	{
					
		System.out.println("Enter employee name:");
		String str= sc.next();
		System.out.println("Enter employee age");
		int age= sc.nextInt();
		System.out.println("Enter employee Address:");
		String addres=sc.next();
		System.out.println("Enter employee Salary");
		long salary =sc.nextLong();
		
		Employee employee= new Employee();	
		employee.setEmpName(str);
		employee.setEmpAge(age);
		employee.setEmpAddress(addres);
		employee.setSalary(salary);

		service.addEmployee(employee);
	}
	}

}
