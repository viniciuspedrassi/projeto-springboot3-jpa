package com.viniciuspedrassi.projeto.java.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.projeto.java.web.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
