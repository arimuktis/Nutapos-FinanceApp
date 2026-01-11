package com.nutapos.data.di

import android.content.Context
import androidx.room.Room
import com.nutapos.data.local.database.FinanceDatabase
import com.nutapos.data.repository.UserRepositoryImpl
import com.nutapos.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): FinanceDatabase {
        return Room.databaseBuilder(
            context,
            FinanceDatabase::class.java,
            "finance_app_db"
        ).build()
    }

    @Provides
    fun provideUserDao(db: FinanceDatabase) = db.userDao()
}