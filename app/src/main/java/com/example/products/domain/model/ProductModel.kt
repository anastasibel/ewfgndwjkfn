package com.example.products.domain.model

data class ProductModel(
    val id: Int,
    val categoryId: Int,
    val storeId: Int,
    val name: String,
    val description: String,
    val image: String,
    val price: Int,
    val averageRating: Double,
    val specifications: List<ProductSpecificationModel>,
)