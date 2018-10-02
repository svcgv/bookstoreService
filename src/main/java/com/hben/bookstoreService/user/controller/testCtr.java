package com.hben.bookstoreService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testCtr {
	@RequestMapping("/hello")
	public String index(){
		return "aaa";
	}

}
