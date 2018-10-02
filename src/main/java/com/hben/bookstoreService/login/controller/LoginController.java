package com.hben.bookstoreService.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆、登出操作
 * @author ice-cream
 *
 */
@RestController
public class LoginController {
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		return "logout";
	}
	


}
