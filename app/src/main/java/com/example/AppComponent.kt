package com.example

import com.example.products.data.DataModule
import com.example.products.core.NetworkModule
import com.example.products.domain.ProductRepository
import com.example.products.presentation.productsList.ProductsListFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, NetworkModule::class])
interface AppComponent {

    fun inject(fragment: ProductsListFragment)
}