package com.yao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yao.dao.LoginDao;
import com.yao.model.UserModel;
import com.yao.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public UserModel findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return loginDao.findUserByEmail(email);
	}

	@Override
	public int saveRegUser(UserModel user) {
		// TODO Auto-generated method stub
		return loginDao.saveRegUser(user);
	}

}
