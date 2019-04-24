package com.interview.controller;

@Restcontroller
public class LoginController {
	
	@autowired
	LoginService loginService;
	
	@RequestMapping(value="/api/login",method=RequestMethod.GET)
	public String login(ModelMap model) {
		loginService.login
		return "success";
	}

}
