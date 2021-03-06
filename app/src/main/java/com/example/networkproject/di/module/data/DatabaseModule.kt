package com.example.networkproject.di.module.data

import android.content.Context
import androidx.room.Room
import com.example.networkproject.data.database.AppDatabase
import com.example.networkproject.data.database.dao.EmployeeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "network-db"
        ).build()
    }

    @Provides
    fun provideEmployeeDao(appDatabase: AppDatabase): EmployeeDao {
        return appDatabase.employeeDao()
    }
}
