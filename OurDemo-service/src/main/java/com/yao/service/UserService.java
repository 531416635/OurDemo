package com.yao.service;

import com.yao.model.User;

public interface UserService {

	/**
	 * 根据email查询用户信息
	 * @param email
	 * @return
	 */
	public User findUserByEmail(String email);
}
