package com.example.springdemo.dto

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.Email


open class TodoDto(
    @field:Email(message = "Email is not valid")
    @JsonProperty("description")
    val description: String
)
