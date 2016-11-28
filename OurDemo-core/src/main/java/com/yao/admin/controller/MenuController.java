package com.yao.admin.controller;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.yao.model.Menu;
import com.yao.model.MenuExample;
import com.yao.service.MenuService;
import com.yao.utils.EhcacheUtils;

@Controller
@RequestMapping(value = "/admin/menu")
public class MenuController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MenuService service;

	@RequestMapping("/menuManager.html")
	public String initMenu(HttpServletResponse response) {
		logger.debug("进入菜单管理页面");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		return "adminsite/menuManager";
	}

	@RequestMapping(value = "/getMenuList", method = RequestMethod.POST)
	public JSONObject getMenuList() {
		JSONObject json = new JSONObject();
		json.put("errorID", 0);
		@SuppressWarnings("unchecked")
		List<Menu> menuList = (List<Menu>) EhcacheUtils.getCache("menuList");
		if (CollectionUtils.isEmpty(menuList)) {
			menuList = service.selectByExample(new MenuExample());
			json.put("result", menuList);
		} else {
			json.put("result", menuList);
		}
		return json;
	}
}
