package com.controller;

    import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;  
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  
	@Controller  
	public class MainController 
	{
		
	    @RequestMapping("/hello")  
	    public ModelAndView helloWorld()
	    {  
	        String message = "HELLO SPRING MVC HOW R U";  
	        return new ModelAndView("Hellopage", "message", message);  
	    }  
	    @RequestMapping("/login")  
	    public ModelAndView logincheck(HttpServletRequest request,HttpServletResponse response)
	    {  
	        String message = request.getParameter("username");
	        
	        return new ModelAndView("login", "login", message);  
	    }  
	    @RequestMapping(value="/login",method=RequestMethod.POST)  
	    public ModelAndView logincheckPost(HttpServletRequest request,HttpServletResponse response)
	    {  
	        String message = request.getParameter("username");
	        
	        return new ModelAndView("login", "login", message.concat("post"));  
	    }  
	}  
	
	

