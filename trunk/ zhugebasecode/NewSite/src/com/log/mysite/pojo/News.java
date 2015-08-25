package com.log.mysite.pojo;

import java.util.Date;



public class News implements Entity {

	private static final long serialVersionUID = 8747833078847425556L;
	private Long id;
	private NewsCategory category;
	private String title;
	private String content;
	private String keyword;
	private Boolean isOpen;
	private String reprint;
	private String reprintAddress;
	private Integer count;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;
	
	private static final String TITLE = "TITLE";					//标题
	private static final String CONTENT = "CONTENT";				//内容
	private static final String KEYWORD = "KEYWORD";				//标签
	private static final String ISOPEN = "ISOPEN";					//是否首页显示
	private static final String REPRINT = "REPRINT";				//来源
	private static final String REPRINT_ADDRESS = "REPRINT_ADDRESS"; //转地址
	private static final String COUNT = "COUNT";					//阅读数
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间
	

	

	/** default constructor */
	public News() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NewsCategory getCategory() {
		return category;
	}

	public void setCategory(NewsCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getReprint() {
		return reprint;
	}

	public void setReprint(String reprint) {
		this.reprint = reprint;
	}

	public String getReprintAddress() {
		return reprintAddress;
	}

	public void setReprintAddress(String reprintAddress) {
		this.reprintAddress = reprintAddress;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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