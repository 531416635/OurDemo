package com.yao.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@RequestMapping(value="/index")
	public String index(){
		logger.info("跳转到首页");
		return "adminsite/index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		logger.info("跳转到登录页");
		return "adminsite/login";
	}
}
