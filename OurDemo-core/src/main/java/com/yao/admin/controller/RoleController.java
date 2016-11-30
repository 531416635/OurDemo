package com.yao.admin.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.yao.model.Menu;
import com.yao.model.MenuExample;
import com.yao.model.Roles;
import com.yao.model.RolesExample;
import com.yao.service.RolesService;
import com.yao.utils.EhcacheUtils;
import com.yao.vo.TreeNode;

@Controller
@RequestMapping(value = "/admin/role")
public class RoleController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RolesService service;

	/**
	 * iframe跳转到菜单管理页面
	 * @param response
	 * @return
	 */
	@RequestMapping("/roleManager.html")
	public String initRole(HttpServletResponse response) {
		logger.debug("进入角色管理页面");
		response.setHeader("X-Frame-Options", "SAMEORIGIN");
		return "adminsite/roleManager";
	}

	/**
	 * 获取菜单列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getRoleList", method = RequestMethod.POST)
	public JSONObject getRoleList() {
		JSONObject json = new JSONObject();
		json.put("errorID", 0);
		@SuppressWarnings("unchecked")
		List<Roles> roleList = (List<Roles>) EhcacheUtils.getCache("roleList");
		if (CollectionUtils.isEmpty(roleList)) {
			roleList = service.selectByExample(new RolesExample());
		} 
		json.put("result", roleList);
		logger.debug(json.toJSONString());
		return json;
	}
	
	/**
	 * 获取Combotree菜单列表
	 * @return
	 */
	//@ResponseBody
	//@RequestMapping(value = "/getCombotreeMenu", method = RequestMethod.POST)
	/*public JSONObject getCombotreeMenu() {
		JSONObject json = new JSONObject();
		json.put("errorID", 0);
		List<TreeNode> menuList = service.selectTreeNode(new MenuExample());
		json.put("result", menuList);
		logger.debug(json.toJSONString());
		return json;
	}*/
	
	/**
	 * 保存新增的菜单信息
	 * @param menu
	 * @return
	 */
	//@ResponseBody
	//@RequestMapping(value = "/saveMenu", method = RequestMethod.POST)
	/*public JSONObject saveMenu(Menu menu) {
		JSONObject json = new JSONObject();
		json.put("errorID", 0);
		menu.setCreatetime(new Date());
		int result = service.insert(menu);
		json.put("result", result);
		logger.debug(json.toJSONString());
		return json;
	}*/
}
