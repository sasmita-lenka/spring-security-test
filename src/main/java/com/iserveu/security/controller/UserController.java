package com.iserveu.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iserveu.security.entity.User;
import com.iserveu.security.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("register-user")
	public User register(@RequestBody User user) {
		
		return userService.saveUsers(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		
		return userService.verify(user);
		
	}
	
	@GetMapping("/get-all-user")
	public List<User> getAllUser() {
		
		return userService.getAllUsers();
	}
}
