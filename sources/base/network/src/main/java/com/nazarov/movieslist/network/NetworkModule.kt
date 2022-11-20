package com.nazarov.movieslist.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.nazarov.movieslist.core.qualifiers.RestApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @RestApi
    @Provides
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient, @RestApi baseUrl: String) =
        Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .baseUrl(baseUrl)
        .build()

    @Provides
    fun provideGson() = GsonBuilder().create()

    @Provides
    fun provideOkHttpClient() = OkHttpClient.Builder()
        .build()
}
