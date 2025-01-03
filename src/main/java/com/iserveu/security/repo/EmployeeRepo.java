package com.iserveu.security.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iserveu.security.entity.Employeee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employeee, UUID>{

}
