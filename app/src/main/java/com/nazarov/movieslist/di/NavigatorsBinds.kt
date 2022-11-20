package com.nazarov.movieslist.di

import com.nazarov.movieslist.movies.di.MoviesNavigatorModule
import com.nazarov.movieslist.welcome.di.WelcomeNavigatorModule
import dagger.Module

@Module(
    includes = [
        WelcomeNavigatorModule::class,
        MoviesNavigatorModule::class,
    ]
)
interface NavigatorsBinds
