package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;

@Service
public class UserSeviceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EmailRepo emailRepo;

	@Override
	public User registerUSer(User user) throws UserException {
		User usr = userRepo.save(user);

		if (usr != null) {
			return usr;
		} else
			throw new UserException("User Not registered");
	}

	@Override
	public User loginUser(Email email, String password) throws EmailException {
		if (email.getEmail().equals(password)) {
			return email.getUser();
		} else
			throw new EmailException("Email: " + email.getEmail() + "or Password " + password + "is wrong ");
	}

	@Override
	public List<Email> getAllMails(Integer emailID) throws EmailException {
		List<Email> emails = emailRepo.findAll();
		if(emails.size() != 0) {
			return emails;
		}
		
		else
			throw new EmailException("No emails with emailId :"+emailID);
	}

	@Override
	public List<Email> getAllStarredMail() throws EmailException {
		Email email= new Email();
		List<Email> emails= email.getStarredEmail();
		
		if(emails.size()!=0) {
			return emails;
		}
		else
			throw new EmailException("No starred emails");
	}

}
