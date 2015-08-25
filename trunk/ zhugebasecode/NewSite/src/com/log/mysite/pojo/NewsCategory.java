package com.log.mysite.pojo;

import java.util.Date;



public class NewsCategory implements Entity {

	
	private static final long serialVersionUID = 6889825729208742946L;
	

	private Long id;
	private String name;
	private String remark;
	private Long father;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;

	private static final String NAME = "NAME";						//名称
	private static final String REMARK = "REMARK";					//备注
	private static final String FATHER = "FATHER";					//父结点
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间

	
	public NewsCategory() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getFather() {
		return father;
	}

	public void setFather(Long father) {
		this.father = father;
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