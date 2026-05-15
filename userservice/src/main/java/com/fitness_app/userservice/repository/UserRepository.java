package com.fitness_app.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitness_app.userservice.model.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByEmail(String email);
}
