package com.nazarov.movieslist.di

import android.app.Application
import android.content.Context
import com.nazarov.movieslist.core.AndroidDependenciesProvider
import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.core.NetworkProvider
import com.nazarov.movieslist.core.di.ViewModelFactoryModule
import com.nazarov.movieslist.coreimpl.AndroidDependenciesComponent
import com.nazarov.movieslist.network.NetworkComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        NetworkProvider::class,
        AndroidDependenciesProvider::class,
    ],
    modules = [
        ApplicationModule::class,
        NavigatorsBinds::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent : DependenciesProvider {

    companion object {

        fun init(
            context: Context
        ): AppComponent {
            val androidDependenciesProvider = AndroidDependenciesComponent.init(context)
            val networkProvider = NetworkComponent.init(androidDependenciesProvider)
            return DaggerAppComponent.factory()
                .create(androidDependenciesProvider, networkProvider)
        }
    }

    @Component.Factory
    interface Factory {

        fun create(
            androidDependenciesProvider: AndroidDependenciesProvider,
            networkProvider: NetworkProvider
        ): AppComponent
    }

    fun inject(app: Application)
}
