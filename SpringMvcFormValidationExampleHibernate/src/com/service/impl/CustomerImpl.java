package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.orm.CustomerDao;

import net.codejava.spring.User;
@Service("customerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerImpl implements CustomerService
{
	
	@Autowired
	private CustomerDao customerDao;
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int addCustomerDetails(User user)
	{
	
		return customerDao.addCustomerDetails(user);
	}
	@Override
	public String checkCustomer(String email, String password)
	{
		System.out.println(email+"==service="+password);
		return customerDao.checkCustomer(email, password);
	}

}
