package com.nazarov.movieslist.movies.di

import com.nazarov.movieslist.movies.data.repository.MoviesRepositoryImpl
import com.nazarov.movieslist.movies.domain.repository.IMoviesRepository
import dagger.Binds
import dagger.Module

@Module
interface MoviesDataModule {

    @Binds
    fun bindMoviesDataRepository(
        moviesDataRepositoryImpl: MoviesRepositoryImpl
    ): IMoviesRepository
}
