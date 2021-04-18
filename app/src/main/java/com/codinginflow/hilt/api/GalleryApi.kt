package com.codinginflow.hilt.api

import com.codinginflow.hilt.data.List.ResponseNew
import retrofit2.http.GET

interface GalleryApi {

    companion object {
        const val BASE_URL = "https://random-data-api.com/api/"
    }

    @GET("restaurant/random_restaurant?size=20")
    suspend fun searchPhotos(
    ): ResponseNew
}