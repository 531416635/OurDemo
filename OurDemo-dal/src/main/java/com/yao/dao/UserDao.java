package com.yao.dao;


import com.yao.model.User;

public interface UserDao {

	/**
	 * 根据email查询对应的用户信息
	 * @param email
	 * @return
	 */
	User findUserByEmail(String email);
}
