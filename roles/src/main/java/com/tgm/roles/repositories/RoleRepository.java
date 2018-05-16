package com.tgm.roles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgm.roles.domain.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
	Role findByRoleId(String roleId);
}
