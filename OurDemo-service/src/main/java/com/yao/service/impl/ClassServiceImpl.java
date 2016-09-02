package com.yao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yao.dao.ClassDao;
import com.yao.model.FileInfo;
import com.yao.service.ClassService;

@Service("classService")
public class ClassServiceImpl implements ClassService{

	@Autowired
	private ClassDao classDao;
	
	@Override
	public int savefile(FileInfo fileInfo) {
		// TODO Auto-generated method stub
		return classDao.savefile(fileInfo);
	}

	@Override
	public void updatefile(FileInfo fileInfo) {
		// TODO Auto-generated method stub
		classDao.updatefile(fileInfo);
	}

	@Override
	public List<FileInfo> selectfile() {
		// TODO Auto-generated method stub
		return classDao.selectfile();
	}

}
