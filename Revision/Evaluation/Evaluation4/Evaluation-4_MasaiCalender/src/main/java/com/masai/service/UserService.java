package com.masai.service;

import java.util.List;

import com.masai.entities.User;
import com.masai.exception.UserException;

public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public List<User> getAllUser() throws UserException;
	
	public User updateUser(User user, Integer userId) throws UserException;

}
