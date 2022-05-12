package com.example.springdemo.model

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "todos")
open class TodoModel(
    open val description: String = ""
) : BaseModel() {

}
