package com.nazarov.movieslist.welcome.di

import com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier
import com.nazarov.movieslist.welcome.navigator.WelcomeNavigatorImpl
import com.nazarov.movieslist.welcomeapi.WelcomeNavigator
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface WelcomeNavigatorModule {

    @Binds
    @IntoMap
    @NavigatorsQualifier
    @ClassKey(WelcomeNavigator::class)
    fun bindNavigator(navigator: WelcomeNavigatorImpl): Any
}
