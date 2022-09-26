package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AccountException;
import com.masai.model.Account;
import com.masai.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accService;
	
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> openAccHandler(@RequestBody Account account) throws AccountException{
		Account acc= accService.openAccount(account);
		
		
		return new ResponseEntity<Account>(acc,HttpStatus.CREATED);
		
	}
	
}
