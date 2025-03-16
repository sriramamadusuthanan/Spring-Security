package com.pratice.SpringSecurityBasic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class M_Controllers {
	
	//let make it as public endpoint
	@GetMapping("/")
	public String getHome()
	{
		return "homepage";
	}
	@GetMapping("/home")
	public String getHome1()
	{
		return "homepage";
	}
	
	//let have security for this endpoint
	@GetMapping("/user")
	public String getUser()
	{
		return "user";
	}

}
