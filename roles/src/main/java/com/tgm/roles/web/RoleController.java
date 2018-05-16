package com.tgm.roles.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tgm.roles.domain.Role;
import com.tgm.roles.repositories.RoleRepository;

@RestController
public final class RoleController {
	private final RoleRepository roleRepository;
	
	@Autowired
	public RoleController(RoleRepository roleRepository){
		this.roleRepository = roleRepository;
	}
	
	@Transactional
	@RequestMapping(method = RequestMethod.PUT, value = "/roles")
	Role save(@PathVariable String id){
		Role role = new Role(id);
		roleRepository.save(role);
		return role;
	}
}
