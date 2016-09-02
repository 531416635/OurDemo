package com.yao.service;

import java.util.List;

import com.yao.model.FileInfo;

public interface ClassService {

	/**
	 * 保存文件信息
	 * @param fileInfo
	 * @return
	 */
	public int savefile(FileInfo fileInfo);
	
	/**
	 * 更新文件信息
	 * @param fileInfo
	 */
	void updatefile(FileInfo fileInfo);
	
	/**
	 * 查询文件信息
	 * @return
	 */
	List<FileInfo> selectfile();
}
