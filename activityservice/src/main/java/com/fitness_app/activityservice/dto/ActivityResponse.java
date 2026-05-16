package com.fitness_app.activityservice.dto;

import java.time.LocalDateTime;
import java.util.Map;

import com.fitness_app.activityservice.model.ActivityType;

import lombok.Data;

@Data
public class ActivityResponse {
    private String id;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Map<String, Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;    
}

