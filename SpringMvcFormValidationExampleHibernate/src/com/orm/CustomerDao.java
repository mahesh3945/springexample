package com.orm;

import net.codejava.spring.User;

public interface CustomerDao
{
	public int addCustomerDetails(User user);
    public String checkCustomer(String email,String password);
}
