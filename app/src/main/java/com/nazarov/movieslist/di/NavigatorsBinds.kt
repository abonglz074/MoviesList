package com.nazarov.movieslist.di

import com.nazarov.movieslist.welcome.di.WelcomeNavigatorModule
import dagger.Module

@Module(
    includes = [
        WelcomeNavigatorModule::class,
    ]
)
interface NavigatorsBinds
