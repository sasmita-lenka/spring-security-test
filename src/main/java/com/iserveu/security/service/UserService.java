package com.iserveu.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.iserveu.security.entity.User;
import com.iserveu.security.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	@Autowired
	JwtService jwtService;

	@Autowired
	AuthenticationManager authenticationManager;

	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

	public User saveUsers(User user) {

		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

	public List<User> getAllUsers() {

		return userRepo.findAll();
	}

	public String verify(User user) {

	
		System.out.println("user "+user);
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));

		if (authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getName());
		}
		return "Failure";
	}

}
