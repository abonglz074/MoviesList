package com.nazarov.movieslist.movies.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/nazarov/movieslist/movies/di/MoviesNetworkModule;", "", "()V", "provideAuthorizationApi", "Lcom/nazarov/movieslist/movies/data/api/MoviesApi;", "retrofit", "Lretrofit2/Retrofit;", "movies_debug"})
@dagger.Module()
public final class MoviesNetworkModule {
    
    public MoviesNetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nazarov.movieslist.movies.data.api.MoviesApi provideAuthorizationApi(@org.jetbrains.annotations.NotNull()
    @com.nazarov.movieslist.core.qualifiers.RestApi()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}