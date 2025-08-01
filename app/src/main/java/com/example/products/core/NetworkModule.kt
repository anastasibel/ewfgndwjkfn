package com.example.products.core

import com.example.products.data.ProductsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(networkHelper: NetworkHelper): Retrofit {
        return networkHelper.retrofit
    }

    @Provides
    @Singleton
    fun provideNetworkHelper(): NetworkHelper {
        return NetworkHelper()
    }
}