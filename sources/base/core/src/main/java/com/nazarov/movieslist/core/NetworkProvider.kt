package com.nazarov.movieslist.core

import com.nazarov.movieslist.core.qualifiers.RestApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit

interface NetworkProvider {

    @RestApi
    fun provideRetrofit(): Retrofit

    fun provideOkHttpClient(): OkHttpClient
}
