package com.yao.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.yao.model.User;
import com.yao.model.UserExample;
import com.yao.model.UserExample.Criteria;
import com.yao.service.UserService;
import com.yao.vo.EasyUIParamVO;
import com.yao.vo.PageVO;

@Controller
@RequestMapping(value = "/admin")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService service;

	/**
	 * 获取用户列表
	 * 
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllUser")
	public JSONObject getAllUser(User user, PageVO page,
			EasyUIParamVO easyUIParam) {
		JSONObject json = new JSONObject();
		json.put("errorID", 0);
		logger.info(user.toString());
		try {
			Map<String, Object> result = new HashMap<String, Object>();
			UserExample example = new UserExample();
			int totalCount = (int) service.getCountByExample(example);
			page.setTotalRow(totalCount);
			example.setPage(page);
			example.setEasyUIParam(easyUIParam);
			List<User> users = service.selectByExample(example);
			result.put("users", users);
			result.put("totalCount", totalCount);
			json.put("result", result);
			json.put("message", "获取用户信息成功");
		} catch (Exception e) {
			e.printStackTrace();
			json.put("errorID", 1);
			json.put("message", "获取用户信息失败，请重试！");
		}

		return json;
	}
}
