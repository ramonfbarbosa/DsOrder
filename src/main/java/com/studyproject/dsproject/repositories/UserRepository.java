package com.studyproject.dsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyproject.dsproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
