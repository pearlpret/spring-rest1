package io.egen.api.service;

import java.util.List;

import io.egen.api.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findUser(String id);
	
	public User  createUser(User user);
	
	public User updateUser(String id,User user);
	
	public void delete(String id);
	
}
