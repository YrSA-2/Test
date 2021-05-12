package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.User;
import com.test.repository.UserRepository;

@Service
public class UserServiceImpl{

	@Autowired
	private UserRepository userRepo;

	public User login(String username, String password) {
		User user = userRepo.findUsernamePassword(username, password);
		return user;
	}
		
	
	

}
