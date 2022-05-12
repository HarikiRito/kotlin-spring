package com.example.springdemo.service

import com.example.springdemo.model.TodoModel
import com.example.springdemo.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService(@Autowired val todoRepository: TodoRepository) {
    fun getTodos(): List<TodoModel> {
        return todoRepository.list()
    }
}
