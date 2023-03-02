package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.User;
import com.masai.services.UserService;

@RestController
@RequestMapping("/masaiAtm/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid User user) {
        User createdUser = userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestHeader(value = "Authorization") String authorizationHeader) {
        String jwt = userService.loginUser(authorizationHeader);
        return ResponseEntity.ok(jwt);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logoutUser() {
        userService.logoutUser();
        return ResponseEntity.ok("User logged out successfully");
    }
}
