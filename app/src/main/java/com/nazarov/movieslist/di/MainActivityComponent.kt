package com.nazarov.movieslist.di

import com.nazarov.movieslist.MainActivity
import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.welcomeapi.WelcomeNavigator
import dagger.Component

@Component(
    dependencies = [
        DependenciesProvider::class,
        WelcomeNavigator::class
    ]
)
interface MainActivityComponent {

    companion object {

        fun init(
            dependenciesProvider: DependenciesProvider
        ): MainActivityComponent {
            return DaggerMainActivityComponent.builder()
                .dependenciesProvider(dependenciesProvider)
                .build()
        }
    }

    fun inject(mainActivity: MainActivity)
}
