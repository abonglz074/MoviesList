package com.nazarov.movieslist.movies.di

import com.nazarov.movieslist.core.qualifiers.RestApi
import com.nazarov.movieslist.movies.data.api.MoviesApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MoviesNetworkModule {

    @Provides
    fun provideAuthorizationApi(
        @RestApi retrofit: Retrofit
    ): MoviesApi {
        return retrofit.create(MoviesApi::class.java)
    }
}
