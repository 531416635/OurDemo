package com.yao.model;

import java.sql.Date;

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
	private String email;// 邮箱
	private String phone;// 电话
	private int roleId;// 角色ID
	private Date regtime;// 注册时间
	private int status;// 账户状态
	private int isEmailVerify;// 是否是邮箱注册
	private int activeCode;// 激活码状态

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

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Date getRegtime() {
		return regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIsEmailVerify() {
		return isEmailVerify;
	}

	public void setIsEmailVerify(int isEmailVerify) {
		this.isEmailVerify = isEmailVerify;
	}

	public int getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(int activeCode) {
		this.activeCode = activeCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", phone=" + phone
				+ ", roleId=" + roleId + ", regtime=" + regtime + ", status="
				+ status + ", isEmailVerify=" + isEmailVerify + ", activeCode="
				+ activeCode + "]";
	}
}
