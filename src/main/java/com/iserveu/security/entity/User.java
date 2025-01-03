package com.iserveu.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "Users")
@Data
public class User {

	@Id
	private String id;
	private String name;
	private String password;
}
