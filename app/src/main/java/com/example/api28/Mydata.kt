package com.example.api28

data class Mydata(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)