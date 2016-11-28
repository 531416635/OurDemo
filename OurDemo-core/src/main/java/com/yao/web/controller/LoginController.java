package com.yao.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.yao.model.UserModel;
import com.yao.service.LoginService;
import com.yao.utils.MD5Utils;
import com.yao.utils.SpringMailUtils;
/**
 * 与登录相关的用户操作
 * @author yaoyuxiao
 * @date 2016年9月2日 上午9:35:15
 */
@Controller
public class LoginController {

	private static final Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	/**
	 * 跳转到邮箱注册页面
	 * 
	 * @return
	 */
	@RequestMapping("web/toRegister")
	public String toRegister(){
		return "website/toRegister";
	}
	
	/**
	 * 注册页面发送注册链接
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="web/sendRegisterMsg")
	public int sendRegisterMsg(UserModel user){
		//生成激活码
		String activecode=MD5Utils.getMD5(user.getUsername()+user.getEmail()+"yyx");
		user.setActivecode(activecode);
			user.setRegtime(new Date());
		try {
			int str = loginService.saveRegUser(user);
			if(str==3){
				SpringMailUtils.sendMail(user.getEmail(), user.getUsername(), activecode);
			}
			return str;
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return 0;
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
	@RequestMapping(value="web/login",produces = "application/json;charset=UTF-8")
	public Object login(String email,String password,HttpServletRequest request){
		JSONObject stri=new JSONObject();
		stri.put("data", "1");
		UserModel user=loginService.findUserByEmail(email);
		if(user!=null&&user.getPassword().equals(password)){
			logger.info("登录成功！邮箱:{}，密码:{}",email,password);
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			stri.put("data", "2");
		}
		
		return stri;
	}
	
	/**
	 * 退出操作，清除session中的user值，防止创建session,重定向首页
	 * @param request
	 */
	@RequestMapping("web/loginout")
	public String loginout(HttpServletRequest request){
		HttpSession session = request.getSession(false);//防止创建Session 
		UserModel user =(UserModel) session.getAttribute("user");
		logger.info("退出成功！邮箱:{}，密码:{}",user.getEmail(),user.getPassword());
		session.removeAttribute("user");
		return "redirect:index.html";
	}
}
