package com.log.mysite.pojo;

/**
 * UserPrivilege entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class UserPrivilege implements Entity {

	// Fields

	private Long id;
	private Long privilegeId;
	private Long userId;

	// Constructors

	/** default constructor */
	public UserPrivilege() {
	}

	/** full constructor */
	public UserPrivilege(Long privilegeId, Long userId) {
		this.privilegeId = privilegeId;
		this.userId = userId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}