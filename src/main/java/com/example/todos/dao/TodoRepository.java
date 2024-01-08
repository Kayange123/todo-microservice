package com.example.todos.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.todos.model.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
