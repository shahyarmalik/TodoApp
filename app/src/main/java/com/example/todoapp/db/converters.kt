package com.example.todoapp.db

import androidx.room.TypeConverter
import java.util.Date

class converters {
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }
    @TypeConverter
    fun toDate(time: Long): Date {
        return Date(time)
    }

}