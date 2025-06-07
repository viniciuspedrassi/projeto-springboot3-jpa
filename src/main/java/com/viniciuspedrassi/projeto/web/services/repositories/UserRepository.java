package com.viniciuspedrassi.projeto.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.projeto.web.services.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
