package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcController {
	@Autowired
	serviceClass service;
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public String login(User user) {
		//System.out.println("NAME:"+user.getName());
		try {
		service.saveUser(user);
		return "Data successfully added to the Database!";
		}catch(Exception e) {
			return "Data is not added to the Database";
		}
		
		
		
		
	}
	
}
