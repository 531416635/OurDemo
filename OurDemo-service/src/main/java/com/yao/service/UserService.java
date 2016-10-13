package com.yao.service;

import java.util.List;

import com.yao.model.User;
import com.yao.model.UserExample;

public interface UserService {
	
	/**
	 * 获取总数，根据传入的参数的字段获取对应的总数
	 * @param example
	 * @return
	 */
	public long getCountByExample(UserExample example);
	
	/**
	 * 获取用户列表，根据传入的参数获取用户列表
	 * @param example
	 * @return
	 */
	public List<User> selectByExample(UserExample example);

	/**
	 * 根据主键ID获取用户
	 * @param id
	 * @return
	 */
	public User selectByPrimaryKey(Integer id);
}
