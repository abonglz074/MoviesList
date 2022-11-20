package com.nazarov.movieslist.movies.data.repository

import com.nazarov.movieslist.core.network.ResponseStatus
import com.nazarov.movieslist.movies.data.api.MoviesApi
import com.nazarov.movieslist.movies.data.entities.MoviesListResponse
import java.io.IOException
import javax.inject.Inject

class MoviesRepositoryImpl
@Inject constructor(
    private val moviesApi: MoviesApi
) {

    suspend fun requestMoviesList(): ResponseStatus<MoviesListResponse> {
        return try {
            val apiResponse = moviesApi.requestMoviesList()
            if (apiResponse.isSuccessful) {
                ResponseStatus.Success(apiResponse.body())
            } else {
                ResponseStatus.Error(apiResponse.message())
            }
        } catch (e: IOException) {
            ResponseStatus.Error(e.message)
        }
    }
}
