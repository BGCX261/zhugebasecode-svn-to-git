package com.log.mysite.pojo;

import java.util.Date;



public class Photo implements Entity {

	

	private Long id;
	private Photobox boxId;
	private String name;
	private String photoPath;
	private String remark;
	private User createdBy;
	private Date createdDate;
	private User updatedBy;
	private Date updatedDate;
	private Boolean deleted;

	private static final String BOXID = "BOXID";					//参照ID
	private static final String NAME = "NAME";						//名字
	private static final String PHOTO_PATH = "PHOTO_PATH";			//路径
	private static final String REMARK = "REMARK";					//备注
	private static final String CREATED_BY = "CREATED_BY";			//创建人
	private static final String CREATED_DATE = "CREATED_DATE";		//创建时间
	private static final String UPDATE_BY = "UPDATE_BY"; 			//更新人
	private static final String UPDATE_DATE = "UPDATE_DATE";		//更新时间
	private static final String DELETED = "DELETED";				//是否删除
	
	
	public Photo() {
	}

	
	public Photo(Photobox boxId, String name, String photoPath, String remark,
			User createdBy, Date createdDate, User updatedBy, Date updatedDate,
			Boolean deleted) {
		this.boxId = boxId;
		this.name = name;
		this.photoPath = photoPath;
		this.remark = remark;
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


	public Photobox getBoxId() {
		return boxId;
	}


	public void setBoxId(Photobox boxId) {
		this.boxId = boxId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhotoPath() {
		return photoPath;
	}


	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
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