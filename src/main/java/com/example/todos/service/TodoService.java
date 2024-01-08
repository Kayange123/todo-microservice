package com.example.todos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todos.dao.TodoRepository;
import com.example.todos.dto.TodoRequest;
import com.example.todos.model.Todo;

@Service
public class TodoService {
    final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(TodoRequest todoRequest) {
        Todo todo = Todo.builder()
                .name(todoRequest.getName())
                .description(todoRequest.getDescription())
                .isCompleted(todoRequest.isCompleted())
                .build();
        return todo;
    }
}
