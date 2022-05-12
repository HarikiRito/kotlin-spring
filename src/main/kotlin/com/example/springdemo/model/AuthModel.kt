package com.example.springdemo.model

import javax.persistence.*

@Entity
@Table(name = "jwt_auth")
open class AuthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 0
}
