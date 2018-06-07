package com.example.kotlinrest.controllers

import com.example.kotlinrest.model.Product
import com.example.kotlinrest.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
class ProductsController {

    @Autowired
    lateinit var repository: ProductRepository

    @GetMapping("/")
    @ResponseBody
    fun todo(): MutableList<Product>? = repository.findAll()
}