package com.example.kotlinrest.tasks

import com.example.kotlinrest.model.Product
import com.example.kotlinrest.model.Todo
import com.example.kotlinrest.repository.ProductRepository
import com.example.kotlinrest.repository.TodoRepository
import org.springframework.stereotype.Component

@Component
class InsertionTask(var todoRepository: TodoRepository, var productRepository: ProductRepository) {

  fun insert() {
    if (todoRepository.findAll()?.isEmpty()!!) {
      todoRepository.save(Todo("Create Spring Boot Application with Kotlin", false))
      todoRepository.save(Todo("Create MongoDB Spring wrapper and insert data", false))
    }
    if (productRepository.findAll()?.isEmpty()!!) {
      (1..10).forEach {
        val product = Product()
        product.name = "Product $it"
        product.description = "Product description $it"
        product.categoryId = it.toLong()
        product.price = it * 2.0
        productRepository.save(product)
      }
    }
    println("<<<<<< Insertion Success >>>>>>")
  }
}
