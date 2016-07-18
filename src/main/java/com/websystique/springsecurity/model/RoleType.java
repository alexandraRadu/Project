package com.websystique.springsecurity.model;

public enum RoleType {
	
	ADMIN("ROLE_ADMIN"),
	DBA("ROLE_DBA"),
	USER("ROLE_USER");
	
	String roleType;
	
	private RoleType(String roleType) {
		this.roleType = roleType;
	}
	
	public String getRoleType() {
		return roleType;
	}
}
