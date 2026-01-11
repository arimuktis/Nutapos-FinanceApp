package com.nutapos.core.di

import com.nutapos.core.dispatcher.DefaultDispatcherProvider
import com.nutapos.core.dispatcher.DispatcherProvider
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import dagger.Module

@Module
@InstallIn(SingletonComponent::class)
object CoroutineModule {

    @Provides
    @Singleton
    fun provideDispatcherProvider(): DispatcherProvider = DefaultDispatcherProvider()
}