package net.codejava.spring;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.impl.CustomerService;
/**
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class LoginController
{
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLogin(Map<String, Object> model) {
		User user = new User();
		model.put("userForm", user);
		return "LoginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("userForm") User userForm,
			BindingResult result, Map<String, Object> model) 
	{
		System.out.println(userForm.getEmail()+ "\t" + userForm.getPassword());
		if (result.getErrorCount()>6) {
			
System.out.println("if ");
			return "LoginForm";
		}
		else
		{//impl.check(userForm.getEmail(),userForm.getPassword());
			System.out.println("else");
			String emailId=customerService.checkCustomer(userForm.getEmail(), userForm.getPassword());
			System.out.println("*************EMAIL ID********"+emailId);
			if(emailId!=null)
			{
				return "LoginSuccess";
			}
			else
			{
			return "LoginForm";
		    }
		}
	}
	@RequestMapping(value="/NewSignup", method =RequestMethod.GET)
	public String viewSignup(Map<String, Object> model)
	{
		User user = new User();
		model.put("userForm", user);
	System.out.println("*************ERROR********");
		return "NewSignup";
	}
	@RequestMapping(value="/NewSignup", method =RequestMethod.POST)
	public String doSignup(@Valid @ModelAttribute("userForm") User userForm,
			BindingResult result, Map<String, Object> model) 
	{
		if (result.hasErrors()) {
			return "NewSignup";
		}
		else
		{
			
		int res=customerService.addCustomerDetails(userForm);
		if(res>0)
		{
			return "LoginForm";
		}
		else
		{
			return "NewSignup";
		}
			//impl.check(userForm.getEmail(),userForm.getPassword());
		}
	}
	
}