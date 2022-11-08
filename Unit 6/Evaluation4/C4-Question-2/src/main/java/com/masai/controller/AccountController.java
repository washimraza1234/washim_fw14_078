package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.AccountException;
import com.masai.exceptions.InsufficientFundException;
import com.masai.model.Account;
import com.masai.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService aService;

	@PostMapping("/accounts")
	public ResponseEntity<Account> openAccountHandler(@RequestBody Account acc) throws AccountException {
		Account account = aService.openAccount(acc);
		return new ResponseEntity<Account>(account, HttpStatus.ACCEPTED);
	}

	@GetMapping("/accounts/{accno}")
	public ResponseEntity<Account> closeAccountHandler(@PathVariable("accno") Integer accno) throws AccountException {
		Account acc = aService.closeAccount(accno);
		return new ResponseEntity<Account>(acc, HttpStatus.ACCEPTED);

	}

	@GetMapping("/depositAmount/{accno}/{amount}")
	public ResponseEntity<Account> depositAmountHandler(Integer accno, Integer amount) throws AccountException {

		Account acc = aService.depositAmount(accno, amount);
		return new ResponseEntity<Account>(acc, HttpStatus.OK);

	}

	public ResponseEntity<Account> withdrawAmountHandler(Integer accno, Integer amount)
			throws AccountException, InsufficientFundException {
		Account acc = aService.withdrawAmount(accno, amount);
		return new ResponseEntity<Account>(acc, HttpStatus.OK);
	}

}
