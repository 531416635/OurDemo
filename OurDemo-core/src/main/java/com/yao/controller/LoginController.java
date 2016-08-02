package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	/**
	 * 跳转到邮箱注册页面
	 * 
	 * @return
	 */
	@RequestMapping("web/toRegister")
	public String toRegister(){
		return "website/toRegister";
	}
	
}
