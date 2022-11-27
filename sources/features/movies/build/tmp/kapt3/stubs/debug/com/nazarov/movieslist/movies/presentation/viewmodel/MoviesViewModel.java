package com.nazarov.movieslist.movies.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\fR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/nazarov/movieslist/movies/presentation/viewmodel/MoviesViewModel;", "Lcom/nazarov/movieslist/coreui/viewmodel/BaseViewModel;", "repository", "Lcom/nazarov/movieslist/movies/data/repository/MoviesRepository;", "(Lcom/nazarov/movieslist/movies/data/repository/MoviesRepository;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_moviesList", "", "Lcom/nazarov/movieslist/movies/data/entities/MoviesListResponse;", "_navigateBack", "", "_progressBar", "", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "moviesList", "getMoviesList", "navigateBack", "getNavigateBack", "progressBar", "getProgressBar", "onBackButtonClicked", "movies_debug"})
public final class MoviesViewModel extends com.nazarov.movieslist.coreui.viewmodel.BaseViewModel {
    private final com.nazarov.movieslist.movies.data.repository.MoviesRepository repository = null;
    private androidx.lifecycle.MutableLiveData<kotlin.Unit> _navigateBack;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _progressBar;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.nazarov.movieslist.movies.data.entities.MoviesListResponse>> _moviesList;
    
    @javax.inject.Inject()
    public MoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.repository.MoviesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getNavigateBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.nazarov.movieslist.movies.data.entities.MoviesListResponse>> getMoviesList() {
        return null;
    }
    
    public final void onBackButtonClicked() {
    }
    
    public final void getMoviesList() {
    }
}