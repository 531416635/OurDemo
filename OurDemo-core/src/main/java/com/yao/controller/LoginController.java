package com.yao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	/**
	 * 登录（根据注册邮箱验证密码）
	 * @param email
	 * @param password
	 * @param request
	 * @return
	 */
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
	
	/**
	 * 退出操作，清除session中的user值，防止创建session,重定向首页
	 * @param request
	 */
	@RequestMapping("web/loginout")
	public String loginout(HttpServletRequest request){
		HttpSession session = request.getSession(false);//防止创建Session 
		User user =(User) session.getAttribute("user");
		logger.info("退出成功！邮箱:{}，密码:{}",user.getEmail(),user.getPassword());
		session.removeAttribute("user");
		return "redirect:index.do";
	}
}
