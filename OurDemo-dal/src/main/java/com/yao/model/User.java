package com.yao.model;

import java.util.Date;

/**
 * 用户信息表userinfo
 * 
 * @author yaoyuxiao
 * @createDate 2016年8月2日 下午5:12:58
 */
public class User {
	private int id;// 自增长ID
	private String username;// 用户名
	private String password;// 密码
	private int usertype;//用户类型
	private String userphoto;//用户头像
	private String email;// 邮箱
	private String phone;// 电话
	private int roleid;// 角色ID
	private Date regtime;// 注册时间
	private int userstatus;// 账户状态
	private int activestatus;// 激活码状态
	private String activecode;//激活码
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	public String getUserphoto() {
		return userphoto;
	}
	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public int getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(int userstatus) {
		this.userstatus = userstatus;
	}
	public int getActivestatus() {
		return activestatus;
	}
	public void setActivestatus(int activestatus) {
		this.activestatus = activestatus;
	}
	public String getActivecode() {
		return activecode;
	}
	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", usertype=" + usertype + ", userphoto="
				+ userphoto + ", email=" + email + ", phone=" + phone
				+ ", roleid=" + roleid + ", regtime=" + regtime
				+ ", userstatus=" + userstatus + ", activestatus="
				+ activestatus + ", activecode=" + activecode + "]";
	}
	
}
