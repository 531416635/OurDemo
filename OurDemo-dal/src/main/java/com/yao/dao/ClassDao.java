package com.yao.dao;

import java.util.List;

import com.yao.model.FileInfo;

public interface ClassDao {

	/**
	 * 保存文件信息
	 * @param fileInfo
	 * @return
	 */
	int savefile(FileInfo fileInfo);
	
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
