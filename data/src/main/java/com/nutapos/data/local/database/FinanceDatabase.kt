package com.nutapos.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nutapos.data.local.dao.UserDao
import com.nutapos.data.local.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class FinanceDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}