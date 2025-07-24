package com.example.products.data

import com.example.products.data.model.ProductDto
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    fun getProductsList(): List<ProductDto>

}