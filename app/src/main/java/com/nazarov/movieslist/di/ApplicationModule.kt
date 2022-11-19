package com.nazarov.movieslist.di

import com.nazarov.movieslist.core.NavigatorsMap
import com.nazarov.movieslist.core.getNavigator
import com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier
import com.nazarov.movieslist.welcomeapi.WelcomeNavigator
import dagger.Module
import dagger.Provides

@Module
object ApplicationModule {

    @Provides
    fun provideWelcomeNavigator(
        @NavigatorsQualifier navigatorMap: NavigatorsMap
    ): WelcomeNavigator {
        return navigatorMap.getNavigator()
    }
}
