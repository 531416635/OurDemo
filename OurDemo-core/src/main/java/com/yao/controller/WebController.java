package com.yao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/web")
public class WebController {
	
	private static final Logger logger=LoggerFactory.getLogger(WebController.class);
	
	/**
	 * 跳转到网站首页
	 * @return
	 */
	@RequestMapping(value="/index")
	public String index(){
		return "website/index";
	}
	
	/**
	 * 班级相册
	 * @return
	 */
	@RequestMapping(value="/toalbum")
	public String toalbum(){
		
		return "website/album";
	}
	
}
