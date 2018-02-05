package com.example.kotlinrest

import com.example.kotlinrest.model.Todo
import com.example.kotlinrest.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinRestApplication : CommandLineRunner {

    @Autowired
    lateinit var repository: TodoRepository

    override fun run(vararg args: String?) {

        repository.deleteAll()
        repository.save(Todo("Create Spring Boot Application with Kotlin", false))
        repository.save(Todo("Create MongoDB Spring wrapper and insert data", false))
        repository.findAll()?.forEach(::println)

    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinRestApplication::class.java, *args)
}
