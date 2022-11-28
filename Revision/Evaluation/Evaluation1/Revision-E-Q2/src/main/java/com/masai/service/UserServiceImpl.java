package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.EmailException;
import com.masai.exceptions.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EmailRepo emailRepo;
	
	@Override
	public List<User> getAllUsers() throws UserException {
		List<User> users= userRepo.findAll();
		
		if(users.size() <= 0) {
			throw new UserException("No Users available");
		}
		else {
			return users;
		}
	}

	@Override
	public User createUser(User user) throws UserException {
		User usr= userRepo.save(user);
		if(usr == null) {
			throw new UserException("No Users available");
		}
		else {
			return usr;
		}
		
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		Optional<User> usr= userRepo.findById(id);
		
		if(usr.isPresent()) {
			return usr.get();
		}
		else
			throw new UserException("No user with id: "+id);
	}

	@Override
	public User deleteUser(Integer id) throws UserException {
		Optional<User> user= userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else
			throw new UserException("No user to delete with id :"+id);
		
	}

	@Override
	public User getEmailForUser(User email) throws UserException {
		User usr= userRepo.findByEmail(email);
		
		if(usr==null) {
			throw new UserException("No User with mail id: "+email);
		}
		else
			return usr;
		
	}

	@Override
	public Email createEmail(Email email) throws EmailException {
		Email em= emailRepo.save(email);
		
		if(em == null) {
			throw new EmailException("No email created");
		}
		
		else
			return em;
	}

	

	
	
	
	

}
