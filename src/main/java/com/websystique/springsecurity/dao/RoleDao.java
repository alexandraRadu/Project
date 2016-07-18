package com.websystique.springsecurity.dao;

import java.util.List;

import com.websystique.springsecurity.model.Role;

public interface RoleDao {

	List<Role> findAll();

	Role findByRole(String role);

	Role findById(int id);
}
