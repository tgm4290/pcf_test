package com.tgm.roles.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="`role`")
public class Role {

	@JsonProperty("role_id")
	private volatile String roleId;
	
	public Role(String roleId)
	{
		this.roleId = roleId;
	}
	
	public String getRoleId()
	{
		return roleId;
	}
}
