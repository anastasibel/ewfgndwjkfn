package com.example.products.domain.model

import com.example.products.data.model.ProductSpecificationDto

data class ProductModel(
    val id: Int,
    val categoryId: Int,
    val storeId: Int,
    val name: String,
    val description: String,
    val image: String,
    val price: Int,
    val averageRating: Double,
    val specifications: List<ProductSpecificationDto>,
)