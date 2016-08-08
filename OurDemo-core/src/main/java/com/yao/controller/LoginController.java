package com.yao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private static final Logger logger=LoggerFactory.getLogger(LoginController.class);
	/**
	 * 跳转到邮箱注册页面
	 * 
	 * @return
	 */
	@RequestMapping("web/toRegister")
	public String toRegister(){
		return "website/toRegister";
	}
	@RequestMapping("web/register")
	public String toRegister2(String email1,String email2){
		logger.info(email1);
		logger.info(email2);
		return "website/toRegister";
	}
	
}
