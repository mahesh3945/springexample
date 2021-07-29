package com.orm;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import net.codejava.spring.User;
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	 private SessionFactory sessionFactory;
	@Override
	public int addCustomerDetails(User user)
	{	
		Customer customer = new Customer();
		customer.setFirstName(user.getFirstName());
		customer.setLastName(user.getLastName());	
		customer.setEmail(user.getEmail());
		customer.setPassword(user.getPassword());
		customer.setMobileNumber(user.getMobileNumber());
		customer.setGender(user.getGender());
		customer.setDob(user.getDob());
		
		sessionFactory.getCurrentSession().save(customer);
		return 1;
	}
	@Override
	public String checkCustomer(String email, String password)
	{
		Query qry=sessionFactory.getCurrentSession().createQuery("select c.email from Customer as c where c.email ='"+email+"' and password ='"+password+"'");
		List<String> emailid=qry.list();
		return emailid.get(0);
	}
}
