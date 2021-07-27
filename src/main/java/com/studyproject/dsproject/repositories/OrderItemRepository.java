package com.studyproject.dsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyproject.dsproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
