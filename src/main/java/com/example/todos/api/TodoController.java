package com.example.todos.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.todos.dto.TodoRequest;
import com.example.todos.model.Todo;
import com.example.todos.service.TodoService;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody @NonNull TodoRequest todoRequest) {
        return todoService.createTodo(todoRequest);
    }

}
