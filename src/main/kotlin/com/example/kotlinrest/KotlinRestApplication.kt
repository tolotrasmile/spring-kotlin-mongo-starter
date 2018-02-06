package com.example.kotlinrest

import com.example.kotlinrest.model.Product
import com.example.kotlinrest.model.Todo
import com.example.kotlinrest.repository.ProductRepository
import com.example.kotlinrest.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinRestApplication : CommandLineRunner {

    @Autowired
    lateinit var todoRepository: TodoRepository

    @Autowired
    lateinit var productRepository: ProductRepository

    override fun run(vararg args: String?) {

        todoRepository.deleteAll()
        todoRepository.save(Todo("Create Spring Boot Application with Kotlin", false))
        todoRepository.save(Todo("Create MongoDB Spring wrapper and insert data", false))
        todoRepository.findAll()?.forEach(::println)

        productRepository.deleteAll()
        (1..10).forEach {
            val product = Product()
            product.name = "Product $it"
            product.description = "Product description $it"
            product.categoryId = it.toLong()
            product.price = it * 2.0
            productRepository.save(product)
        }
        productRepository.findAll()?.forEach(::println)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinRestApplication::class.java, *args)
}
