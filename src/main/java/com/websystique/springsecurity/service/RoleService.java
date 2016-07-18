package com.websystique.springsecurity.service;

import java.util.List;

import com.websystique.springsecurity.model.Role;

public interface RoleService {

	Role findById(int id);

	Role findByRole(String role);

	List<Role> findAll();
}
