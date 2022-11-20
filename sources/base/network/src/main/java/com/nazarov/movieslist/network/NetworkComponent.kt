package com.nazarov.movieslist.network

import com.nazarov.movieslist.core.AndroidDependenciesProvider
import com.nazarov.movieslist.core.NetworkProvider
import dagger.Component

@Component(
    dependencies = [
        AndroidDependenciesProvider::class
    ],
    modules = [
        HttpUrlModule::class,
        NetworkModule::class
    ]
)
interface NetworkComponent : NetworkProvider {

    companion object {

        fun init(
            androidDependenciesProvider: AndroidDependenciesProvider
        ): NetworkProvider {
            return DaggerNetworkComponent.factory()
                .create(androidDependenciesProvider)
        }
    }

    @Component.Factory
    interface Factory {

        fun create(
            androidDependenciesProvider: AndroidDependenciesProvider
        ): NetworkProvider
    }
}
