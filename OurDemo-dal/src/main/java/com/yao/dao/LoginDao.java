package com.yao.dao;


import com.yao.model.User;

public interface LoginDao {

	/**
	 * 根据email查询对应的用户信息
	 * @param email
	 * @return
	 */
	User findUserByEmail(String email);
	
	/**
	 * 将注册页面填写的用户信息（邮箱，用户名）存入数据库
	 * @param user
	 * @return
	 */
	int saveRegUser(User user);
}
