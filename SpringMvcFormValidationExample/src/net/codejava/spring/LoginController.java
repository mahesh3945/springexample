package net.codejava.spring;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class LoginController {
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
		if (result.hasErrors()) {
			return "LoginForm";
		}
		else
		{
			//impl.check(userForm.getEmail(),userForm.getPassword());
		}
		return "LoginSuccess";
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
			//impl.check(userForm.getEmail(),userForm.getPassword());
		}
		return "LoginSuccess";
	}
	
	
	
}