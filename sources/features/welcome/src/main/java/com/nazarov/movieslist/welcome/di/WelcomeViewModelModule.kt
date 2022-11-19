package com.nazarov.movieslist.welcome.di

import androidx.lifecycle.ViewModel
import com.nazarov.movieslist.core.di.ViewModelKey
import com.nazarov.movieslist.welcome.presentation.viewmodel.WelcomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WelcomeViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(WelcomeViewModel::class)
    fun provideWelcomeViewModel(welcomeViewModel: WelcomeViewModel): ViewModel
}
