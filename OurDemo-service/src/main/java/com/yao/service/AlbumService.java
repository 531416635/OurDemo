package com.yao.service;

import java.util.List;

import com.yao.model.FileInfo;
import com.yao.model.PhotoAlbum;

public interface AlbumService {

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
	
	/**
	 * 查询相册信息
	 * @return
	 */
	List<PhotoAlbum> selectphotoalbum();
}