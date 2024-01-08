package com.example.todos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TodoRequest {
    private String name;
    private String description;
    private boolean isCompleted;
}