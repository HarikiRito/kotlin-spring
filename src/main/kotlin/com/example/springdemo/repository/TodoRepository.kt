package com.example.springdemo.repository

import com.example.springdemo.model.TodoModel
import org.springframework.data.jpa.repository.JpaRepository


interface TodoRepository : JpaRepository<TodoModel, Long> {
}
