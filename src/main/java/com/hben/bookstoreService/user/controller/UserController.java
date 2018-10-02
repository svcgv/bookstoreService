package com.hben.bookstoreService.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户注册，修改用户信息操作
 * @author ice-cream
 *
 */
@RestController
public class UserController {
	@RequestMapping("/addUser")
	public String addUser(){
		return "addUser";
	}
	
	@RequestMapping("/delUser")
	public String delUser(){
		return "delUser";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(){
		return "updateUser";
	}
	
	@RequestMapping("/queryUser")
	public String queryUser(){
		return "queryUser";
	}
	

}
