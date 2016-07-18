package com.websystique.springsecurity.dao;

import java.util.List;

import com.websystique.springsecurity.model.User;

public interface UserDao {

	User findById(int id);

	User findByUsername(String username);

	void save(User user);

	void deleteById(int id);

	List<User> findAllUsers();
}
