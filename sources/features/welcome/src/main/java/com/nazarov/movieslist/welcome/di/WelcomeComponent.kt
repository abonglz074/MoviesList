package com.nazarov.movieslist.welcome.di

import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.core.di.ViewModelFactoryModule
import com.nazarov.movieslist.core.scopes.FeatureScope
import com.nazarov.movieslist.welcome.presentation.fragment.WelcomeFragment
import dagger.Component
import javax.inject.Singleton

@FeatureScope
@Component(
    dependencies = [DependenciesProvider::class],
    modules = [
        ViewModelFactoryModule::class,
        WelcomeViewModelModule::class,
        ProvideNavigatorsModule::class
    ]
)
interface WelcomeComponent {

    companion object {

        fun init(dependenciesProvider: DependenciesProvider): WelcomeComponent {
            return DaggerWelcomeComponent.factory()
                .create(dependenciesProvider)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(dependenciesProvider: DependenciesProvider): WelcomeComponent
    }

    fun inject(welcomeFragment: WelcomeFragment)
}
