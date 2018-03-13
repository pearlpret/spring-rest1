package io.egen.api.repository;

import java.util.List;

import io.egen.api.entity.User;

public interface UserRepository {

	
	public List<User> findAll();
	
	public User findUser(String id);
	
	public User  createUser(User user);
	
	public User updateUser(String id,User user);
	
	public void delete(String id);
	
	public User findUserByEmail(String email); 
	
}
