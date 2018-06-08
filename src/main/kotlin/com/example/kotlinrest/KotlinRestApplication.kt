package com.example.kotlinrest

import com.example.kotlinrest.tasks.InsertionTask
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinRestApplication(var task: InsertionTask) : CommandLineRunner {
  override fun run(vararg args: String?) {
    task.insert()
  }
}

fun main(args: Array<String>) {
  SpringApplication.run(KotlinRestApplication::class.java, *args)
}
