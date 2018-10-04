package org.book.api.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 用户注册，修改用户信息操作
 * @author ice-cream
 *
 */
@RestController
public class UserController {
	@RequestMapping("/addUser")
	public Map<String,Object> addUser(@RequestParam Map<String,Object> data){
		
	
		return data;
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
