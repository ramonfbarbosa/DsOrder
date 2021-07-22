package com.studyproject.dsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyproject.dsproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}