package com.nazarov.movieslist

import android.app.Application
import com.nazarov.movieslist.core.App
import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.di.AppComponent

class MainApp: Application(), App {

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        getAppComponent().inject(this)
    }

    override fun getDependenciesProvider(): DependenciesProvider {
        return getAppComponent()
    }

    override fun cleanComponent() {
        appComponent = null
    }

    private fun getAppComponent(): AppComponent {
        if (appComponent == null) {
            appComponent = AppComponent.init(applicationContext)
        }
        return appComponent!!
    }
}
