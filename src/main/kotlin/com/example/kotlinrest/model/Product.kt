package com.example.kotlinrest.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "products")
class Product {

    @Id
    var id: String? = null
    var name: String? = null
    var categoryId: Long = 0
    var description: String? = null
    var price: Double? = null

}
