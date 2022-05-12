package com.example.springdemo.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "jwt_auth")
open class AuthModel : BaseModel() {
    open val userId: Long = 0
    open val expiredDate: Date = Date();
}
