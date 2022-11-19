package com.nazarov.movieslist.core

import android.content.Context

interface AndroidDependenciesProvider {

    fun provideContext(): Context
}
