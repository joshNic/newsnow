package com.example.newsnow.data.entity

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)