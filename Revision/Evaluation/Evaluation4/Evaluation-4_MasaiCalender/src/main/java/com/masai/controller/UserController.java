package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.User;
import com.masai.exception.UserException;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaicalender")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException{
		User usr= userService.registerUser(user);
		return new ResponseEntity<User>(usr,HttpStatus.CREATED);
	}
	
	@GetMapping("/event")
	public ResponseEntity<List<User>> getAllUserHandler() throws UserException{
		List<User> users= userService.getAllUser();
		
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUserHandler(@RequestBody User user,@PathVariable("id") Integer userId) throws UserException{
		User usr= userService.updateUser(user, userId);
		return new ResponseEntity<User>(usr,HttpStatus.OK);
	}
	
	
}
