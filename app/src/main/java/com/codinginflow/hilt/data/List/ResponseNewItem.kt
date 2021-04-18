package com.codinginflow.hilt.data.List

data class ResponseNewItem(
    val address: String,
    val description: String,
    val hours: Hours,
    val id: Int,
    val logo: String,
    val name: String,
    val phone_number: String,
    val review: String,
    val type: String,
    val uid: String
)