package com.studyproject.dsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyproject.dsproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}