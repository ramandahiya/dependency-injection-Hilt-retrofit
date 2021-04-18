package com.codinginflow.hilt.di

import com.codinginflow.hilt.api.GalleryApi
import com.codinginflow.hilt.ui.gallery.TestClass
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(GalleryApi.BASE_URL)
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideUnsplashApi(retrofit: Retrofit): GalleryApi =
        retrofit.create(GalleryApi::class.java)

    @Provides
    @Singleton
    fun provideTest(): TestClass =
        TestClass()


//
}