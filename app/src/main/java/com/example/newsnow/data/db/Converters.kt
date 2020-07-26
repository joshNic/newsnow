package com.example.newsnow.data.db

import androidx.room.TypeConverter
import com.example.newsnow.data.entity.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}