package com.example.products.data

import com.example.products.data.Mapper.mapToModel
import com.example.products.domain.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductRepository {

    override suspend fun getProductsList() = withContext(Dispatchers.IO) {
        productsApi.getProductsList().map { it.mapToModel() }
    }
}