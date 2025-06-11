package com.viniciuspedrassi.projeto.java.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.projeto.java.web.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}