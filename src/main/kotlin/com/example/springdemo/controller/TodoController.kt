package com.example.springdemo.controller

import com.example.springdemo.dto.TodoDto
import com.example.springdemo.service.TodoService
import com.example.springdemo.util.logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/todos")
class TodoController(
    @Autowired val todoService: TodoService
) {
    @GetMapping()
    fun getTodos() = todoService.getTodos()

    @PostMapping()
    fun createTodo(@Valid @RequestBody body: TodoDto): ResponseEntity<Any> {
        logger.info { body.description }
//        val result = todoService.createTodo(body)
        return ResponseEntity.ok("OK")
    }
}
