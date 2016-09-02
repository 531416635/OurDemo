package com.yao.model;

import java.util.Date;

public class FileInfo {
	
	private int id;//文件id
	private String filename;//文件名
	private String filetype;//文件类型
	private Date uploadtime;//上传时间
	private int uploaduser;//上传人的id
	private String filepath;//保存路径
	private int isdefault;//是否为默认首图
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public Date getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}
	
	public int getUploaduser() {
		return uploaduser;
	}
	public void setUploaduser(int uploaduser) {
		this.uploaduser = uploaduser;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public int getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(int isdefault) {
		this.isdefault = isdefault;
	}
	@Override
	public String toString() {
		return "FileInfo [id=" + id + ", filename=" + filename + ", filetype="
				+ filetype + ", uploadtime=" + uploadtime + ", uploaduser="
				+ uploaduser + ", filepath=" + filepath + ", isdefault="
				+ isdefault + "]";
	}
	
}
