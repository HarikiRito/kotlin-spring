package com.example.springdemo.model

import javax.persistence.*


@Entity
@Table(name = "todos")
open class TodoModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 0,

    open val description: String = "",
)
