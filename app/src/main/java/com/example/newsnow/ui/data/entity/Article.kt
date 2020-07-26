package com.example.newsnow.ui.data.entity

import androidx.room.Entity
import com.example.newsnow.ui.data.Source

@Entity(
    tableName = "articles"
)
data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)