package com.iserveu.security.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iserveu.security.entity.Employeee;
import com.iserveu.security.repo.EmployeeRepo;



@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;

	public Employeee saveEmp(Employeee emp) {
		// TODO Auto-generated method stub
		return employeeRepo.save(emp);
		
	}

	public List<Employeee> getEmp() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
