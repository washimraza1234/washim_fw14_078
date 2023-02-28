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

import com.masai.DTO.Login;
import com.masai.Entity.Account;
import com.masai.Entity.User;
import com.masai.Service.UserService;

@RestController
@RequestMapping("/masaiAtm")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Account accountService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userService.registerUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PostMapping("/user/login")
    public ResponseEntity<LoginResponse> login(@RequestBody Login loginDTO) {
        String token = userService.login(loginDTO.getMobileNumber(), loginDTO.getPassword());
        LoginResponse response = new LoginResponse(token);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/user/account")
    public ResponseEntity<Account> openAccount(@RequestBody Account account) {
        Account newAccount = accountService.openAccount(account);
        return new ResponseEntity<>(newAccount, HttpStatus.OK);
    }

    @PutMapping("/user/deposit")
    public ResponseEntity<Account> deposit(@RequestParam String accountNo, @RequestParam int amount) {
        Account account = accountService.deposit(accountNo, amount);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @PutMapping("/user/transfer/{accountID}")
    public ResponseEntity<Account> transfer(@PathVariable String accountID, @RequestParam String sourceAccountNo,
            @RequestParam String targetAccountNo, @RequestParam int amount) {
        Account account = accountService.transfer(accountID, sourceAccountNo, targetAccountNo, amount);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @GetMapping("/users/{field}/{order}")
    public ResponseEntity<List<User>> getAllUsersSorted(@PathVariable String field, @PathVariable String order) {
        List<User> users = userService.getAllUsers(field, order);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/users/{pageNo}/{noOfRec}")
    public ResponseEntity<List<User>> getUsersByPage(@PathVariable int pageNo, @PathVariable int noOfRec) {
        List<User> users = userService.getUsersByPage(pageNo, noOfRec);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/users/{pageNo}/{noOfRec}/{field}/{order}")
    public ResponseEntity<List<User>> getUsersByPageAndSort(@PathVariable int pageNo, @PathVariable int noOfRec,
            @PathVariable String field, @PathVariable String order) {
        List<User> users = userService.getUsersByPageAndSort(pageNo, noOfRec, field, order);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
