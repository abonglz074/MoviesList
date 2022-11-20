package com.nazarov.movieslist.movies.di

import com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier
import com.nazarov.movieslist.movies.navigator.MoviesNavigatorImpl
import com.nazarov.movieslist.moviesapi.MoviesNavigator
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface MoviesNavigatorModule {

    @Binds
    @IntoMap
    @NavigatorsQualifier
    @ClassKey(MoviesNavigator::class)
    fun bindNavigator(navigator: MoviesNavigatorImpl): Any
}
