package com.log.mysite.pojo;

import java.util.Date;



public class Attachment implements Entity {

	

	private Long id;
	private News newsId;
	private String name;
	private Float size;
	private Integer number;
	private String path;
	private String ext;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;
	
	private static final String NEWSID = "NEWSID";					//新闻ID
	private static final String NAME = "NAME";						//文件名
	private static final String SIZE = "SIZE";						//大小
	private static final String NUMBER = "NUMBER";					//第几个
	private static final String PATH = "PATH";						//路径
	private static final String EXT = "EXT";						//扩展名
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间
	private static final String DELETED = "DELETED";				//是否删除
	
	public Attachment() {
	}

	
	public Attachment(News newsId, String name, Float size, Integer number,
			String path, String ext, User createdBy, Date createdDate,
			User updatedBy, Date updatedDate, Boolean deleted) {
		this.newsId = newsId;
		this.name = name;
		this.size = size;
		this.number = number;
		this.path = path;
		this.ext = ext;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleted = deleted;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public News getNewsId() {
		return newsId;
	}


	public void setNewsId(News newsId) {
		this.newsId = newsId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getSize() {
		return size;
	}


	public void setSize(Float size) {
		this.size = size;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String getExt() {
		return ext;
	}


	public void setExt(String ext) {
		this.ext = ext;
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

	

}