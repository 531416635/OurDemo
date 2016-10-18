package com.yao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yao.dao.UserMapper;
import com.yao.model.User;
import com.yao.model.UserExample;
import com.yao.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper dao;
	
	public long getCountByExample(UserExample example){
		return dao.countByExample(example);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	};
	
	
}
