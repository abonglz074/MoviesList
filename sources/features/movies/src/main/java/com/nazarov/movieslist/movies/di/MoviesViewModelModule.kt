package com.nazarov.movieslist.movies.di

import androidx.lifecycle.ViewModel
import com.nazarov.movieslist.core.di.ViewModelKey
import com.nazarov.movieslist.movies.presentation.viewmodel.MoviesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MoviesViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MoviesViewModel::class)
    fun provideMoviesViewModel(moviesViewModel: MoviesViewModel): ViewModel
}
