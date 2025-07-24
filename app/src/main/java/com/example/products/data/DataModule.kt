package com.example.products.data

import com.example.products.domain.ProductRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindRepository(impl: ProductRepositoryImpl): ProductRepository
}