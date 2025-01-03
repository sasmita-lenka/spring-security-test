package com.iserveu.security.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employeee {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private UUID id;
	private String name;
	private String email;
	private String role;
}
