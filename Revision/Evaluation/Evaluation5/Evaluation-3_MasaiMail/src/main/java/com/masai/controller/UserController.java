package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.User;
import com.masai.exception.UserException;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaimail/")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException{
		User usr= userService.registerUSer(user);
		return new ResponseEntity<User>(usr,HttpStatus.OK);
	}

}
