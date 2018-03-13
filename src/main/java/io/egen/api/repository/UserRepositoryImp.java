package io.egen.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import io.egen.api.entity.User;

@Repository
public class UserRepositoryImp implements UserRepository {

	@Override
	public List<User> findAll() {
		
   List<User> users = new ArrayList<User>();
	User user = new User();
	user.setEmail("gprathap@yahoo.com");
	user.setId("12345");
	
	User user1 = new User();
	user1.setEmail("egen@yahoo.com");
	user1.setId("12" );
	
	User user2 = new User();
	user2.setEmail("harekreishna@yahoo.com");
	user2.setId("125" );
	
	users.add(user);
	users.add(user1);
	users.add(user2);
	
		return users;
	}

	@Override
	public User findUser(String id) {
		User user2 = new User();
		user2.setEmail("harekreishna@yahoo.com");
		user2.setId("125"); 
		return user2;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
