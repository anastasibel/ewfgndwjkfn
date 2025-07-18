package com.example.products.data

import com.example.products.data.model.ProductDto
import com.example.products.data.model.ProductSpecificationDto
import com.example.products.domain.model.ProductModel
import com.example.products.domain.model.ProductSpecificationModel

object Mapper {

    fun ProductDto.mapToModel() = ProductModel(
        id = id,
        categoryId = categoryId,
        storeId = storeId,
        name = name,
        description = description,
        image = image,
        price = price,
        averageRating = averageRating,
        specifications = specifications.map { it.mapToModel() },
    )

    fun ProductSpecificationDto.mapToModel() = ProductSpecificationModel(
        id = id,
        name = name,
        value = value
    )

}