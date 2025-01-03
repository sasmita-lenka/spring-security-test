package com.iserveu.security.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iserveu.security.entity.Employeee;
import com.iserveu.security.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

//import com.iserveu.pool.entity.ConnPoolEntity;
//import com.iserveu.pool.repo.ConnectionRepo;

@RestController
public class ConnectionPoolTest {
	
//	@Autowired
//	Environment env;
//	
//	@Autowired(required=false)
//	private	ConnectionRepo poolRepo;
	
//	public ConnectionPoolTest(ConnectionRepo poolRepo) {
//		super();
//		this.poolRepo = poolRepo;
//	}

//	@GetMapping(path = "/connPool")
//	public String testConnectionPool(@RequestBody String input) {
//		
//		String response = null;
//		
//		try {
//			List<ConnPoolEntity> test = poolRepo.test(Long.parseLong(input));
//			for(ConnPoolEntity var:test) {
//				response = var.getCardtype();
//			}
//			return "1 + " + response;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "0";
//		}
//	}
	
	
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/sec-test")
	public String testing() {
		return "security testing done:";
	}
	
	
	@PostMapping("/save-emp")
	public Employeee saveEmp(@RequestBody Employeee emp) {
		
		return service.saveEmp(emp);
		
	}
	
	@GetMapping("/get-emp")
	public List<Employeee> getAllEmp() {
		
		return service.getEmp();
				
	}
	
	@GetMapping("/get-csrf")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	
	
	
	
}
