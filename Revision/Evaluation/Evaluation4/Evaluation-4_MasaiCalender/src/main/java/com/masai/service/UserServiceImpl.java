package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.User;
import com.masai.exception.UserException;
import com.masai.repository.UserRepo;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User registerUser(User user) throws UserException {
		User usr= userRepo.save(user);
		if(usr != null) {
			return usr;
		}
		else throw new UserException("User not registered");
	}

	@Override
	public List<User> getAllUser() throws UserException {
		List<User> users= userRepo.findAll();
		
		if(users.size()!=0) {
			return users;
		}
		else
			throw new UserException("No users available");
	}

	@Override
	public User updateUser(User user, Integer userId) throws UserException {
		 Optional<User> usr= userRepo.findById(userId);
		 
		 if(usr.isPresent()) {
			 //User existingUser= usr.get();
			 return userRepo.save(user);
			 
		 }
		 else throw new UserException();
	}
	
	

}
