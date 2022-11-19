package com.nazarov.movieslist.coreimpl

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AndroidDependenciesModule(
    private val context: Context
) {

    @Provides
    fun provideContext(): Context = context
}
