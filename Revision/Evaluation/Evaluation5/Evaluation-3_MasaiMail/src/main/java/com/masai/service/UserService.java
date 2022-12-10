package com.masai.service;

import java.util.List;

import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;

public interface UserService {
	
	public User registerUSer(User user) throws UserException;
	
	public User loginUser(Email email, String password) throws EmailException;
	
	public List<Email> getAllMails(Integer emailID) throws EmailException;

	public List<Email> getAllStarredMail() throws EmailException;
}
