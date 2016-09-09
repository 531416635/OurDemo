package com.yao.model;

import java.util.Date;

public class PhotoAlbum {

	private int id;
	private String albumname;//相册名字
	private String albumpath;//相册首图路径
	private Date albumtime;//时间
	private String param1;//预留字段
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlbumname() {
		return albumname;
	}
	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}
	public String getAlbumpath() {
		return albumpath;
	}
	public void setAlbumpath(String albumpath) {
		this.albumpath = albumpath;
	}
	public Date getAlbumtime() {
		return albumtime;
	}
	public void setAlbumtime(Date albumtime) {
		this.albumtime = albumtime;
	}
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	@Override
	public String toString() {
		return "PhotoAlbum [id=" + id + ", albumname=" + albumname
				+ ", albumpath=" + albumpath + ", albumtime=" + albumtime
				+ ", param1=" + param1 + "]";
	}
	

}
