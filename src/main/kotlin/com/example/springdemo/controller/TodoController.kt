package com.example.springdemo.controller

import com.example.springdemo.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController(
    @Autowired val todoService: TodoService
) {
    @GetMapping()
    fun getTodos() = todoService.getTodos()
}


data class Todo(val id: Int, val description: String)
