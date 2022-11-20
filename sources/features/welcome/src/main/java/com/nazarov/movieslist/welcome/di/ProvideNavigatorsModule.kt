package com.nazarov.movieslist.welcome.di

import com.nazarov.movieslist.core.NavigatorsMap
import com.nazarov.movieslist.core.getNavigator
import com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier
import com.nazarov.movieslist.moviesapi.MoviesNavigator
import dagger.Module
import dagger.Provides

@Module
class ProvideNavigatorsModule {

    @Provides
    fun provideMoviesNavigator(
        @NavigatorsQualifier navigatorsMap: NavigatorsMap
    ): MoviesNavigator {
        return navigatorsMap.getNavigator()
    }
}
