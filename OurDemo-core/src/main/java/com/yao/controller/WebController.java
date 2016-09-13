package com.yao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * web页面的主控制器
 * 
 * @author yaoyuxiao
 * @date 2016年9月2日 上午9:35:44
 */
@Controller
@RequestMapping(value = "/web")
public class WebController {

	private static final Logger logger = LoggerFactory.getLogger(WebController.class);

	/**
	 * 跳转到网站首页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index() {
		logger.info("跳转到首页");
		return "website/index";
	}
	/**
	 * 
	 * PC页面拦截
	 * 
	 * @param request
	 * @param pagename
	 * @return
	 */
	@RequestMapping(value = "/test.html", method = RequestMethod.GET)
	public String pagename(HttpServletRequest request) {
		return "test";
	}
	
	@RequestMapping(value="/tojsontest")
	@ResponseBody
	public String getJson(HttpServletResponse response){
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("12", "33");
		System.out.println(JSON.toJSONString(map));
		return JSON.toJSONString(map);
	}
}
