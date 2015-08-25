package com.log.mysite.pojo;

import java.util.Date;



public class Revert implements Entity{

	

	private Long id;
	private Long newsId;
	private Comment commentId;
	private String content;
	private Integer number;
	private String revertIp;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;
	
	private static final String COMMENTID = "COMMENTID";			//评论ID
	private static final String CONTENT = "CONTENT";				//内容
	private static final String NUMBER = "NUMBER";					//数字
	private static final String REVERT_IP = "REVERT_IP";			//回复IP
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间
	private static final String DELETED = "DELETED";				//是否删除
	
	public Revert() {
	}

	
	public Revert(Long newsId, Comment commentId, String content, Integer number,
			String revertIp, User createdBy, Date createdDate, User updatedBy,
			Date updatedDate, Boolean deleted) {
		this.newsId = newsId;
		this.commentId = commentId;
		this.content = content;
		this.number = number;
		this.revertIp = revertIp;
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

	public Long getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

	public Comment getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Comment commentId) {
		this.commentId = commentId;
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

	public String getRevertIp() {
		return this.revertIp;
	}

	public void setRevertIp(String revertIp) {
		this.revertIp = revertIp;
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