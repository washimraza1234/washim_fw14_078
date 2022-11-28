package com.masai.service;

import java.util.List;

import com.masai.exceptions.EmailException;
import com.masai.exceptions.UserException;
import com.masai.model.Email;
import com.masai.model.User;

public interface UserService {
	
	public List<User> getAllUsers() throws UserException;
	
	public User createUser(User user) throws UserException;
	
	public User getUserById(Integer id) throws UserException;
	
	public User deleteUser(Integer id) throws UserException;
	
	public User getEmailForUser(User email) throws UserException;
	
	public Email createEmail(Email email) throws EmailException;


}
