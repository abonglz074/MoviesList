package com.nazarov.movieslist.coreimpl

import android.content.Context
import com.nazarov.movieslist.core.AndroidDependenciesProvider
import dagger.Component

@Component(
    modules = [
        AndroidDependenciesModule::class,
    ]
)
interface AndroidDependenciesComponent : AndroidDependenciesProvider {

    companion object {

        fun init(
            context: Context
        ): AndroidDependenciesProvider {
            return DaggerAndroidDependenciesComponent.builder()
                .androidDependenciesModule(AndroidDependenciesModule(context))
                .build()
        }
    }
}
