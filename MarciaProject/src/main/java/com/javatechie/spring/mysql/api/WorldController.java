package com.javatechie.spring.mysql.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {

	@RequestMapping("/")
	public String showForm()
	{
		return "welcome";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest req)
	{
		String uname=req.getParameter("UserName");
		String pass=req.getParameter("Password");
		if((uname.equals("fresherpro"))&& (pass.equals("fresherpro")))
          {
			return "Reply";
          }
		else
		{
			return "welcome";
		}

	}
}
