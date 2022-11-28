package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@GetMapping("")
	public ResponseEntity<List<User>> getAllUserHandler() throws UserException{
		List<User> users= userService.getAllUsers(); 
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<User> createUserHandler(@RequestBody User user) throws UserException{
		User users= userService.createUser(user); 
		return new ResponseEntity<User>(users,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserByIDHandler(@PathVariable("id") Integer id) throws UserException{
		User users= userService.getUserById(id); 
		return new ResponseEntity<User>(users,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUserByIDHandler(@PathVariable("id") Integer id) throws UserException{
		User users= userService.deleteUser(id); 
		return new ResponseEntity<User>(users,HttpStatus.FOUND);
	}
	
	@PostMapping("/{id}/mail")
	public ResponseEntity<Email> createByIDHandler(@RequestBody Email email) throws Exception{
		Email users= userService.createEmail(email); 
		return new ResponseEntity<Email>(users,HttpStatus.FOUND);
	}
	
	
	
	
	
	
}
