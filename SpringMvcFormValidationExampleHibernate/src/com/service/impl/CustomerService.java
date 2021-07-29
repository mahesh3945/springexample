package com.service.impl;

import net.codejava.spring.User;

public interface CustomerService 
{
	
 public int addCustomerDetails(User user);
 public String checkCustomer(String email,String password);
}
