package com.example.products.domain

import com.example.products.domain.model.ProductModel

interface ProductRepository {

    suspend fun getProductsList(): List<ProductModel>
}