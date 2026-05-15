package com.fitness_app.userservice.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserResponse {
    private String userId;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
