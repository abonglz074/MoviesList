package com.nazarov.movieslist.movies.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/nazarov/movieslist/movies/di/MoviesViewModelModule;", "", "provideMoviesViewModel", "Landroidx/lifecycle/ViewModel;", "moviesViewModel", "Lcom/nazarov/movieslist/movies/presentation/viewmodel/MoviesViewModel;", "movies_debug"})
@dagger.Module()
public abstract interface MoviesViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.nazarov.movieslist.core.di.ViewModelKey(value = com.nazarov.movieslist.movies.presentation.viewmodel.MoviesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.presentation.viewmodel.MoviesViewModel moviesViewModel);
}