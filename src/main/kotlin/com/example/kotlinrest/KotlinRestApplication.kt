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
    var repository: TodoRepository? = null

    override fun run(vararg args: String?) {

        repository?.save(Todo("Create Spring Boot Application with Kotlin", false))
        repository?.save(Todo("Create MongoDB Spring wrapper and insert data", false))

        val all = repository?.findAll()

        all?.forEach {
            println(it.toString())
        }

    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinRestApplication::class.java, *args)
}
