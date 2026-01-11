package com.nutapos.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PresentationModule {


    // You can also provide global string formatters (e.g., CurrencyFormatter)
    // or Navigation managers here.
}