package com.example.springdemo.model

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 1;

    @CreationTimestamp
    open val createdAt: Date = Date();

    @UpdateTimestamp
    open val updatedAt: Date = Date();
    open val deletedAt: Date? = null;
}
