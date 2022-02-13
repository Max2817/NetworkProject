package com.example.networkproject.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.networkproject.data.database.dao.EmployeeDao
import com.example.networkproject.data.database.entities.EmployeeData

@Database(entities = [EmployeeData::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao
}
