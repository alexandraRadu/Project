package com.websystique.springsecurity.service;

import java.util.List;

import com.websystique.springsecurity.model.User;

public interface UserService {

	User findByUsername(String username);

	User findById(int id);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(int id);

	List<User> findAllUsers();
}
