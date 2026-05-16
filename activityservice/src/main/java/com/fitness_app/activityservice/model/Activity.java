package com.fitness_app.activityservice.model;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Document(collection = "activities")
@Data
@Builder
@AllArgsConstructor
public class Activity {
    @Id
    @Generated("uuid")
    private String id;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer time;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Field("metrics")
    private Map<String, Object> additionalMetrics;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
