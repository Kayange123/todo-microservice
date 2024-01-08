package com.example.todos.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Document(value = "todos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Todo {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean isCompleted;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;
}
