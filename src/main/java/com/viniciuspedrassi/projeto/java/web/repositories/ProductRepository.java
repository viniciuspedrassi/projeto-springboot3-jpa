package com.viniciuspedrassi.projeto.java.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.projeto.java.web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
