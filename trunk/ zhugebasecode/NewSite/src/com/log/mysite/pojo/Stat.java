package com.log.mysite.pojo;

import java.util.Date;


public class Stat implements Entity {

	

	private Long id;
	private Long count;
	private Date accessDate;

	private static final String COUNT = "COUNT";				//每天访问量
	private static final String ACCESS_DATE = "ACCESS_DATE";	//访问日期
	
	public Stat() {
	}

	
	public Stat(Long count, Date accessDate) {
		this.count = count;
		this.accessDate = accessDate;
	}

	

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Date getAccessDate() {
		return this.accessDate;
	}

	public void setAccessDate(Date accessDate) {
		this.accessDate = accessDate;
	}

}