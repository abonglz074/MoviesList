package com.nazarov.movieslist.movies.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/nazarov/movieslist/movies/data/repository/MoviesRepository;", "", "moviesApi", "Lcom/nazarov/movieslist/movies/data/api/MoviesApi;", "(Lcom/nazarov/movieslist/movies/data/api/MoviesApi;)V", "requestMoviesList", "Lcom/nazarov/movieslist/core/network/ResponseStatus;", "", "Lcom/nazarov/movieslist/movies/data/entities/MoviesListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "movies_debug"})
public final class MoviesRepository {
    private final com.nazarov.movieslist.movies.data.api.MoviesApi moviesApi = null;
    
    @javax.inject.Inject()
    public MoviesRepository(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.api.MoviesApi moviesApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestMoviesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nazarov.movieslist.core.network.ResponseStatus<java.util.List<com.nazarov.movieslist.movies.data.entities.MoviesListResponse>>> continuation) {
        return null;
    }
}