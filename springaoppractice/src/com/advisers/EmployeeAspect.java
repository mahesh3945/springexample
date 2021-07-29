package com.advisers;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	@Before("execution(public void setName(..))")
	public void getAllAdvice(){
	System.out.println("Service method setter called");
	}
	
	
	
//	@Before("execution(* com.service.*.get*())")
	//public void getAllAdvice(){
		//System.out.println("Service method getter called");
	//}
}
