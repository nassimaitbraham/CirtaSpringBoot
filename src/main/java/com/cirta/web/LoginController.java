package com.cirta.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.cirta.service.LoginService;


@Controller
@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;

	
	
	@RequestMapping("/cirta")
	@ResponseBody
	String loginController(){
		
		loginService.getUser();
		return "nassim say hello world ";
		
	}
	
	@RequestMapping("/rest/test")
	public String testRest(){
		return "test";
	}

}
