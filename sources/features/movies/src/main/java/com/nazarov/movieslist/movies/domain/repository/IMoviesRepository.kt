package com.nazarov.movieslist.movies.domain.repository

import com.nazarov.movieslist.core.network.ResponseStatus
import com.nazarov.movieslist.movies.domain.entities.MoviesListResponse

interface IMoviesRepository {

    suspend fun requestMoviesList(): ResponseStatus<MoviesListResponse>
}
