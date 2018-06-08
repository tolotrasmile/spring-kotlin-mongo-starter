package com.example.kotlinrest.controllers

import com.example.kotlinrest.common.RestController
import com.example.kotlinrest.model.Product
import com.example.kotlinrest.repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@RequestMapping("/products")
class ProductsController(var repository: ProductRepository) : RestController() {

  @GetMapping("/")
  @ResponseBody
  fun todo(): MutableList<Product>? = repository.findAll()

}