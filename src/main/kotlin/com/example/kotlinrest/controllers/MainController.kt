package com.example.kotlinrest.controllers

import com.example.kotlinrest.common.RestController
import com.example.kotlinrest.model.Todo
import com.example.kotlinrest.repository.TodoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

class MainController(var repository: TodoRepository) : RestController() {

  @GetMapping("/")
  @ResponseBody
  fun index(): String = "Hello World"

  @GetMapping("/todos")
  @ResponseBody
  fun todo(): MutableList<Todo>? = repository.findAll()

}
