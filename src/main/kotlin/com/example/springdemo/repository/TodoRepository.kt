package com.example.springdemo.repository

import com.example.springdemo.model.TodoModel
import org.springframework.stereotype.Repository

@Repository
class TodoRepository {
    fun list(): List<TodoModel> {
        return listOf(
            TodoModel(1, "Todo 1"),
            TodoModel(1, "Todo 2")
        )
    }
}
