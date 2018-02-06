package com.example.kotlinrest.repository

import com.example.kotlinrest.model.Product
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
interface ProductRepository : MongoRepository<Product, String>
