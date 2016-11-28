package com.yao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yao.dao.MenuMapper;
import com.yao.model.Menu;
import com.yao.model.MenuExample;
import com.yao.service.MenuService;

public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuMapper dao;
	
	@Override
	public long countByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Menu record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(Menu record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public List<Menu> selectByExample(MenuExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExample(example);
	}

	@Override
	public Menu selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Menu record, MenuExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Menu record, MenuExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
