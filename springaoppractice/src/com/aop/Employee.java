package com.aop;

public class Employee {

	private String name;
	
	public String getName() {
		//System.out.println("****************");
		return name;
	}


	public void setName(String nm) {
		
		//System.out.println("-----------------------");
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}	
	

}