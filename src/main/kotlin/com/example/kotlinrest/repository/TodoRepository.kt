package com.example.kotlinrest.repository

import com.example.kotlinrest.model.Todo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
interface TodoRepository : MongoRepository<Todo, String>