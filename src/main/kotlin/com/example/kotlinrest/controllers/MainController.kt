package com.example.kotlinrest.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping("/")
    @ResponseBody
    fun index(): String = "Hello World"
}