package com.yao.service;

import com.yao.model.User;

public interface LoginService {

	/**
	 * 根据email查询用户信息
	 * @param email
	 * @return
	 */
	public User findUserByEmail(String email);
	
	/**
	 * 将注册页面填写的用户信息（邮箱，用户名）存入数据库
	 * @param user
	 * @return
	 */
	public String saveRegUser(User user);
}
