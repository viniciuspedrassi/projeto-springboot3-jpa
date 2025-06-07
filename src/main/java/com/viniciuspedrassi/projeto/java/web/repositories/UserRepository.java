package com.viniciuspedrassi.projeto.java.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.projeto.java.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
