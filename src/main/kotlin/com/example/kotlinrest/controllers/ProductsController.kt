package com.example.kotlinrest.controllers

import com.example.kotlinrest.model.Product
import com.example.kotlinrest.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin("*")
class ProductsController {

    @Autowired
    lateinit var repository: ProductRepository

    @GetMapping("/products")
    @ResponseBody
    fun todo(): MutableList<Product>? = repository.findAll()
}