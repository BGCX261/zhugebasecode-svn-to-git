package com.log.mysite.pojo;

/**
 * Privilege entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Privilege implements Entity {

	

	private Long id;
	private Long privilegeValue;
	private String privilegeName;
	private String privilegeRemark;
	
	private final static String PRIVILEGE_VALUE = "PRIVILEGE_VALUE"; 	//权限值
	private final static String PRIVILEGE_NAME = "PRIVILEGE_NAME"; 		//权限名
	private final static String PRIVILEGE_REMARK = "PRIVILEGE_REMARK"; 	//备注
	
	
		
	
	public Privilege() {
	}

	
	public Privilege(Long privilegeValue, String privilegeName,
			String privilegeRemark) {
		this.privilegeValue = privilegeValue;
		this.privilegeName = privilegeName;
		this.privilegeRemark = privilegeRemark;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrivilegeValue() {
		return this.privilegeValue;
	}

	public void setPrivilegeValue(Long privilegeValue) {
		this.privilegeValue = privilegeValue;
	}

	public String getPrivilegeName() {
		return this.privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public String getPrivilegeRemark() {
		return this.privilegeRemark;
	}

	public void setPrivilegeRemark(String privilegeRemark) {
		this.privilegeRemark = privilegeRemark;
	}

}