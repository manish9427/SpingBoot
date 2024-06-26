package com.example.demo.controllers;

import com.example.demo.models.Todo;
import com.example.demo.services.TodoService; // Import TodoService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Import List

@RestController
@RequestMapping("/todos") // Specify the mapping for this controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    // Create Todo
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.create(todo); // Delegate creation to TodoService
    }

    // Get all todos
    @GetMapping
    public List<Todo> getAll() {
        return todoService.getAll(); // Delegate fetching all todos to TodoService
    }
}
