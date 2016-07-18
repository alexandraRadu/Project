package com.websystique.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.dao.UserDao;
import com.websystique.springsecurity.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public void saveUser(User user) {
		dao.save(user);
	}


	public void updateUser(User user) {
		User entity = dao.findById(user.getId());
		if(entity!=null){
			entity.setPassword(user.getPassword());
			entity.setUsername(user.getUsername());
			entity.setEmail(user.getEmail());
			entity.setRoles(user.getRoles());
		}
	}

	
	public void deleteUserById(int id) {
		dao.deleteById(id);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public User findByUsername(String username) {
	
		return dao.findByUsername(username);
	}

}
