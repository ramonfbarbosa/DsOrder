package com.studyproject.dsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyproject.dsproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
