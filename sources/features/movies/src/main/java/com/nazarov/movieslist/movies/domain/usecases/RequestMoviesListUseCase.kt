package com.nazarov.movieslist.movies.domain.usecases

import com.nazarov.movieslist.core.network.ResponseStatus
import com.nazarov.movieslist.movies.domain.entities.MoviesListResponse
import com.nazarov.movieslist.movies.domain.repository.IMoviesRepository
import javax.inject.Inject

class RequestMoviesListUseCase
@Inject constructor(
    private val repository: IMoviesRepository
) {

    suspend fun invoke(): ResponseStatus<MoviesListResponse> {
        return repository.requestMoviesList()
    }
}
