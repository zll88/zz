package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/login")
	public String login(){
		System.out.println("进入login的控制器！");
		//return "login"->访问/WEB-INF/login.jsp
		return "login";//跳转到login的jsp
	}
}
