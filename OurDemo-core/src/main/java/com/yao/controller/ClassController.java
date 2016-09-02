package com.yao.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.fastjson.JSONObject;
import com.yao.model.FileInfo;
import com.yao.model.User;
import com.yao.service.ClassService;


/**
 * 与班级展示相关的内容
 * @author yaoyuxiao
 * @date 2016年9月2日 上午9:34:33
 */
@Controller
@RequestMapping("/web")
public class ClassController {
	private static final Logger logger = LoggerFactory.getLogger(ClassController.class);
	
	@Autowired
	private ClassService classService;
	
	/**
	 * 班级相册
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toalbum")
	public String toalbum(Model model) {
		logger.info("toalbum  toalbum  toalbum");
		List<FileInfo> fileInfos=classService.selectfile();
		model.addAttribute("fileInfos", fileInfos);
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
	public JSONObject toalbumajax(HttpServletRequest request,
			HttpServletResponse response) throws IllegalStateException,
			IOException {
		logger.info("测试图片ajax上传效果");
		HttpSession session = request.getSession();
		User user =(User) session.getAttribute("user");
		FileInfo fileInfo =new FileInfo();
		fileInfo.setUploaduser(user.getId());
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
						// 获取文件后缀名
						String houzhuiming = myFileName.substring(myFileName.lastIndexOf(".")).toLowerCase();
						// 定义上传路径
						String path = request.getSession().getServletContext()
								.getRealPath(File.separator);
						File webrootPath = new File(path +  "/" + user.getId() + "/");
						if (!webrootPath.isDirectory()) {
							webrootPath.mkdirs();
						}
						fileInfo.setFiletype(houzhuiming);
						classService.savefile(fileInfo);
						// 重命名上传后的文件名
						path = webrootPath + "/" +fileInfo.getId()+ houzhuiming;
						File localFile = new File(path);
						file.transferTo(localFile);
						fileInfo.setFilepath("/" + user.getId() + "/" + fileInfo.getId()+houzhuiming);
						fileInfo.setUploadtime(new Date());
						fileInfo.setFilename(fileInfo.getId()+"");
						classService.updatefile(fileInfo);
					}
				}
			}

		}
		return JSONObject
				.parseObject("{'event':'1', 'data':'2', 'previewId':'3', 'index':'4'}");
	}
}
