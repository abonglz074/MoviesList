package com.nazarov.movieslist.movies.data.api

import com.nazarov.movieslist.movies.domain.entities.MoviesListResponse
import retrofit2.Response
import retrofit2.http.GET

interface MoviesApi {

    @GET("shows")
    suspend fun requestMoviesList(): Response<MoviesListResponse>
}
