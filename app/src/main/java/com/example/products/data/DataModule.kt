package com.example.products.data

import com.example.products.domain.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [BindModule::class])
class DataModule {

    @Provides
    @Singleton
    fun provideProductsApi(retrofit: Retrofit): ProductsApi {
        return retrofit.create(ProductsApi::class.java)
    }
}

@Module
interface BindModule {

    @Binds
    fun bindRepository(productRepositoryImpl: ProductRepositoryImpl): ProductRepository
}
