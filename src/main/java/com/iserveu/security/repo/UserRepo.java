package com.iserveu.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iserveu.security.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

	User findByName(String username);

}
