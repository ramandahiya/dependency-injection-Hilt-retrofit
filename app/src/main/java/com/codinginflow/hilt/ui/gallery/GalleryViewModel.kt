package com.codinginflow.hilt.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codinginflow.hilt.data.List.ResponseNew
import com.codinginflow.hilt.data.Resource
import com.codinginflow.hilt.data.GalleryRepository
import kotlinx.coroutines.launch


class GalleryViewModel @ViewModelInject constructor(
    private val repository: GalleryRepository
) : ViewModel() {


    private var restaurantsLiveData = MutableLiveData<Resource<ResponseNew>>()
    val restaurants: LiveData<Resource<ResponseNew>> = restaurantsLiveData


    fun callSearch(){
        viewModelScope.launch {
            restaurantsLiveData.value = repository. search()
           val size = restaurants.value
        }


   }



}