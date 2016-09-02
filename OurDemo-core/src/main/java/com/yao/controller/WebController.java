package com.yao.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.fastjson.JSONObject;

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
		return "website/index";
	}

}
