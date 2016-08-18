package com.yao.controller;

import java.beans.Beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yao.model.User;
import com.yao.service.UserService;

@Controller
public class LoginController {

	private static final Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	/**
	 * 跳转到邮箱注册页面
	 * 
	 * @return
	 */
	@RequestMapping("web/toRegister")
	public String toRegister(){
		return "website/toRegister";
	}
	
	@RequestMapping(value="/sendRegisterMsg")
	public String sendRegisterMsg(){
		
		return "website/index";
	}
	
	@RequestMapping("web/register")
	public String toRegister2(String email1,String email2){
		return "website/toRegister";
	}
	
	@ResponseBody
	@RequestMapping("web/login")
	public String login(String email,String password,HttpServletRequest request){
		String str ="1";
		User user=userService.findUserByEmail(email);
		if(user!=null&&user.getPassword().equals(password)){
			logger.info("登录成功！邮箱:{}，密码:{}",email,password);
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			str="2";
		}
		return str;
	}
}
