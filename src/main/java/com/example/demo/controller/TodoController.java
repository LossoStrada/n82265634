package com.example.demo.controller;

import com.example.demo.service.TodoItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TodoController {

    private TodoItemService todoService;

    public TodoController(TodoItemService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String home() {
        return "todoList";
    }

    @GetMapping(value = "/api/v1/user")
    public ResponseEntity<?> returnId() {
        return new ResponseEntity<>("82265634", HttpStatus.OK);
    }
}
