package com.service;

import com.aop.Employee;

public class EmployeeService 
{

private Employee employee;
	
	public Employee getEmployee()
	{
		return this.employee;
	}
	
	public void setEmployee(Employee e)
	{
		this.employee=e;
	}
public String getMessage(String message)
{
	return message;
}
public String getStudent()
{
	return "msg";
}
}