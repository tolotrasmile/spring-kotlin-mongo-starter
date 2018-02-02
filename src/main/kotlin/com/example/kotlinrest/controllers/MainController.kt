package com.example.kotlinrest.controllers

import com.example.kotlinrest.model.Todo
import com.example.kotlinrest.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @Autowired
    lateinit var repository: TodoRepository

    @GetMapping("/")
    @ResponseBody
    fun index(): String = "Hello World"

    @GetMapping("/todos")
    @ResponseBody
    fun todo(): MutableList<Todo>? = repository.findAll()

}