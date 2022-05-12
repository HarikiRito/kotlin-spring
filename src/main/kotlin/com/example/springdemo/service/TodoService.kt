package com.example.springdemo.service

import com.example.springdemo.model.TodoModel
import com.example.springdemo.repository.TodoRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService(@Autowired val todoRepository: TodoRepository) {
    fun getTodos(): List<TodoModel> {
        return todoRepository.findAll()
    }

    fun createTodo(model: TodoModel): TodoModel {
        return todoRepository.save(model)
    }

    fun test() = runBlocking { // this: CoroutineScope
        launch { // launch a new coroutine and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println("World!") // print after delay
        }
        println("Hello") // main coroutine continues while a previous one is delayed
    }
}
