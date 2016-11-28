package com.yao.service;

import com.yao.model.UserModel;

public interface LoginService {

	/**
	 * 根据email查询用户信息
	 * @param email
	 * @return
	 */
	public UserModel findUserByEmail(String email);
	
	/**
	 * 将注册页面填写的用户信息（邮箱，用户名）存入数据库
	 * @param user
	 * @return
	 */
	public int saveRegUser(UserModel user);
}
