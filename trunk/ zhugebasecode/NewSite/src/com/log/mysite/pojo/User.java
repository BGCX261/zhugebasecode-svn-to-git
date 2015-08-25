package com.log.mysite.pojo;

import java.util.Date;

/**
 * User entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class User implements Entity {

	private Long id;
	private String username;
	private String password;
	private String fullname;
	private String pingyinName;
	private Date birthday;
	private String qq;
	private String msn;
	private String email;
	private String telephone;
	private Boolean admin;
	private Boolean valid;
	private String lastIp;
	private Long imageId;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;
	
	private static final String USERNAME = "USERNAME";				//用户名
	private static final String PASSWORD = "PASSWORD";				//密码
	private static final String FULLNAME = "FULLNAME";				//全名
	private static final String PINGYIN_NAME = "PINGYIN_NAME";		//拼音
	private static final String BIRTHDAY = "BIRTHDAY";				//生日
	private static final String QQ = "QQ";							//QQ
	private static final String MSN = "MSN";						//Msn
	private static final String EMAIL = "EMAIL";					//Email
	private static final String	TELEPHONE = "TELEPHONE";			//手机
	private static final String ADMIN = "ADMIN";					//超级管理员
	private static final String VALID = "VALID";					//是否禁用
	private static final String LAST_IP = "LAST_IP";				//最后访问IP
	private static final String IMAGE_ID = "IMAGE_ID";				//图片Id
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间
	private static final String DELETED = "DELETED";				//是否删除
	

	
	public User() {
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



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public String getPingyinName() {
		return pingyinName;
	}



	public void setPingyinName(String pingyinName) {
		this.pingyinName = pingyinName;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public String getQq() {
		return qq;
	}



	public void setQq(String qq) {
		this.qq = qq;
	}



	public String getMsn() {
		return msn;
	}



	public void setMsn(String msn) {
		this.msn = msn;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public Boolean getAdmin() {
		return admin;
	}



	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}



	public Boolean getValid() {
		return valid;
	}



	public void setValid(Boolean valid) {
		this.valid = valid;
	}



	public String getLastIp() {
		return lastIp;
	}



	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}



	public Long getImageId() {
		return imageId;
	}



	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}



	public User getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}



	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	public User getUpdatedBy() {
		return updatedBy;
	}



	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}



	public Date getUpdatedDate() {
		return updatedDate;
	}



	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}



	public Boolean getDeleted() {
		return deleted;
	}



	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}



	


	

	}