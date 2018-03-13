package io.egen.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.egen.api.entity.User;
import io.egen.api.exceptions.BadRequestException;
import io.egen.api.exceptions.NotFoundException;
import io.egen.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	
	}

	@Override
	public User findUser(String id) {
		
		User existing = userRepository.findUser(id);
		if(existing==null)
		{
			throw new NotFoundException("User Not Found"+id);
		}
		return userRepository.findUser(id);
	}

	@Override
	public User createUser(User user) {
		User existing = userRepository.findUserByEmail(user.getEmail());
		if(existing==null)
		{
			throw new BadRequestException("User already exists"+user.getEmail());
		}
		
		return userRepository.createUser(user);
	}

	@Override
	public User updateUser(String id, User user) {
		User existing = userRepository.findUser(id);
		if(existing==null)
		{
			throw new NotFoundException("User Not Found"+id);
		}
		
		return userRepository.updateUser(id, user);
	}

	@Override
	public void delete(String id) {
		
		User existing = userRepository.findUser(id);
		if(existing==null)
		{
			throw new NotFoundException("User Not Found"+id);
		}
	}

	

	
	
}
