package com.yao.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value = "/web")
public class WebController {

	private static final Logger logger = LoggerFactory
			.getLogger(WebController.class);
	int i=0;
	/**
	 * 跳转到网站首页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index() {
		return "website/index";
	}

	/**
	 * 班级相册
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toalbum")
	public String toalbum() {
		logger.info("toalbum  toalbum  toalbum");
		return "website/album";
	}

	/**
	 * 班级相册
	 * 
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/toalbumajax")
	public JSONObject  toalbumajax(HttpServletRequest request,
			HttpServletResponse response) throws IllegalStateException,
			IOException {
		logger.info("测试图片ajax上传效果");
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 取得上传文件
				MultipartFile file = multiRequest.getFile(iter.next());
				if (file != null) {
					// 取得当前上传文件的文件名称
					String myFileName = file.getOriginalFilename();
					// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
					if (myFileName.trim() != "") {
						//获取文件后缀名
						String houzhuiming=myFileName.substring(myFileName.lastIndexOf(".")).toLowerCase();
						// 定义上传路径
						String path = request.getSession().getServletContext()
								.getRealPath(File.separator);
						File webrootPath = new File(path + "/brandImg/");
						if (!webrootPath.isDirectory()) {
							webrootPath.mkdirs();
						}
						// 重命名上传后的文件名
						path = webrootPath  + "/id"+i
								+ houzhuiming;
						i++;
						File localFile = new File(path);
						file.transferTo(localFile);
					}
				}
			}

		}
		return JSONObject.parseObject("{'event':'1', 'data':'2', 'previewId':'3', 'index':'4'}");
	}
}
