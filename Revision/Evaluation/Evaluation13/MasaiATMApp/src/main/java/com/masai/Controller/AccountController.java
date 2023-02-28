package com.masai.Controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Account;
import com.masai.Exception.CustomException;

@RestController
@RequestMapping("/masaiAtm")
public class AccountController {
	
	@Autowired
	private Account accountService;

@GetMapping("/accounts/{accountNo}")
public ResponseEntity<Account> getAccountByAccountNo(@PathVariable String accountNo) {
    Account account = accountService.getAccountByAccountNo(accountNo);
    return new ResponseEntity<>(account, HttpStatus.OK);
}

@GetMapping("/accounts/{userId}/{bankName}")
public ResponseEntity<List<Account>> getAccountsByUserIdAndBankName(
        @PathVariable Long userId, @PathVariable String bankName) {
    List<Account> accounts = accountService.getAccountsByUserIdAndBankName(userId, bankName);
    return new ResponseEntity<>(accounts, HttpStatus.OK);
}

@PostMapping("/user/account")
public ResponseEntity<Account> openAccount(@RequestBody Account accountDTO) throws CustomException {
    Account account = accountService.openAccount(accountDTO);
    return new ResponseEntity<>(account, HttpStatus.OK);
}

@PutMapping("/user/deposit")
public ResponseEntity<Account> depositAmount(@RequestParam String accountNo, @RequestParam Integer amount) throws CustomException {
    Account account = accountService.depositAmount(accountNo, amount);
    return new ResponseEntity<>(account, HttpStatus.OK);
}

@PutMapping("/user/transfer/{accountNo}")
public ResponseEntity<Account> transferAmount(@PathVariable String accountNo, @RequestParam String beneficiaryAccountNo, @RequestParam Integer amount) throws CustomException {
    Account account = accountService.transferAmount(accountNo, beneficiaryAccountNo, amount);
    return new ResponseEntity<>(account, HttpStatus.OK);
}
}