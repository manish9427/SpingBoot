package com.example.demo.services;

import com.example.demo.models.Todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList; // Import ArrayList
import java.util.List; // Import List

@Service
public class TodoService {
    private List<Todo> list = new ArrayList<>(); // Correct the typo

    public Todo create(Todo todo){
        list.add(todo);
        return todo;
    }

    public List<Todo> getAll(){ // Correct method name to getAll
        return list;
    }
}
