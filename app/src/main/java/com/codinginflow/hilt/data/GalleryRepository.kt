package com.codinginflow.hilt.data

import com.codinginflow.hilt.api.GalleryApi
import com.codinginflow.hilt.data.List.ResponseNew

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GalleryRepository @Inject constructor(private val unsplashApi: GalleryApi) :
    BaseRepository() {

    suspend  fun search() : Resource<ResponseNew> {


      return  safeApiCall {
          unsplashApi.searchPhotos()
      }

    }




}