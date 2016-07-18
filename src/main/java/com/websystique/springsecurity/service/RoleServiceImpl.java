package com.websystique.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.dao.RoleDao;
import com.websystique.springsecurity.model.Role;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleDao dao;
	
	public Role findById(int id) {
		return dao.findById(id);
	}

	public Role findByRole(String role){
		return dao.findByRole(role);
	}

	public List<Role> findAll() {
		return dao.findAll();
	}

}
