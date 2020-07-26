package com.example.newsnow.ui.data

import com.example.newsnow.ui.data.entity.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)