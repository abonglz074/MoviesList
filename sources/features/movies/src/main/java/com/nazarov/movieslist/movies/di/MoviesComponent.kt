package com.nazarov.movieslist.movies.di

import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.core.di.ViewModelFactoryModule
import com.nazarov.movieslist.core.scopes.FeatureScope
import com.nazarov.movieslist.movies.presentation.fragment.MoviesFragment
import dagger.Component

@FeatureScope
@Component(
    dependencies = [DependenciesProvider::class],
    modules = [
        MoviesViewModelModule::class,
        ProvideNavigatorsModule::class,
        ViewModelFactoryModule::class,
        MoviesDataModule::class,
    ]
)
interface MoviesComponent {

    companion object {

        fun init(dependenciesProvider: DependenciesProvider): MoviesComponent {
            return DaggerMoviesComponent.factory()
                .create(dependenciesProvider)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(dependenciesProvider: DependenciesProvider): MoviesComponent
    }

    fun inject(moviesFragment: MoviesFragment)
}
