package com.example.retrofit_234963.data

import com.example.retrofit_234963.data.model.Product
import kotlinx.coroutines.flow.Flow


interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}