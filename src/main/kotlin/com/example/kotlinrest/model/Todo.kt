package com.example.kotlinrest.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "todos")
class Todo(var title: String, var completed: Boolean) {

    @Id
    var id: String? = null

    override fun toString(): String {
        return String.format("Todo[id=%s, title='%s', completed='%s']", id, title, completed)
    }

}
