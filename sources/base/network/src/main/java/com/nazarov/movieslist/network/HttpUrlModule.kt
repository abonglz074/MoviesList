package com.nazarov.movieslist.network

import com.nazarov.movieslist.core.qualifiers.RestApi
import dagger.Module
import dagger.Provides

private const val REST_API_URL = "https://api.tvmaze.com/"

@Module
object HttpUrlModule {

    @Provides
    @RestApi
    fun provideRestApiUrl(): String {
        return REST_API_URL
    }
}
