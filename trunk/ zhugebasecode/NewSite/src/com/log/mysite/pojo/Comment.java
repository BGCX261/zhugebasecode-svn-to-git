package com.log.mysite.pojo;

import java.util.Date;



public class Comment implements Entity {

	// Fields

	private Long id;
	private News newsId;
	private String content;
	private Integer number;
	private String commentIp;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;

	private static final String NEWSID = "NEWSID";					//新闻ID
	private static final String CONTENT = "CONTENT";				//评论内容
	private static final String NUMBER = "NUMBER";					//第几个
	private static final String COMMENT_IP = "COMMENT_IP";			//评论IP
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间
	private static final String DELETED = "DELETED";				//是否删除
	
	public Comment() {
	}

	
	public Comment(News newsId, String content, Integer number,
			String commentIp, User createdBy, Date createdDate, User updatedBy,
			Date updatedDate, Boolean deleted) {
		this.newsId = newsId;
		this.content = content;
		this.number = number;
		this.commentIp = commentIp;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.deleted = deleted;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public News getNewsId() {
		return this.newsId;
	}

	public void setNewsId(News newsId) {
		this.newsId = newsId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCommentIp() {
		return this.commentIp;
	}

	public void setCommentIp(String commentIp) {
		this.commentIp = commentIp;
	}

	public User getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}