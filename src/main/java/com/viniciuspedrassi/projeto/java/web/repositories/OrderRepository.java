package com.viniciuspedrassi.projeto.java.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.projeto.java.web.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
