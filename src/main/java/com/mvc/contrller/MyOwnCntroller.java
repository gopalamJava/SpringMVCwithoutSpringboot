package com.mvc.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyOwnCntroller {
	
	
	@GetMapping("/home")
	
	public String getHome() {
		
		return "home";
	}
	
	
	
	
	
	

}
