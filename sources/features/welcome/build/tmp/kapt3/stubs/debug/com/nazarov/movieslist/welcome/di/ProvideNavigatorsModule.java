package com.nazarov.movieslist.welcome.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\'\b\u0001\u0010\u0005\u001a!\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\b\t0\u0006j\u0002`\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/nazarov/movieslist/welcome/di/ProvideNavigatorsModule;", "", "()V", "provideMoviesNavigator", "Lcom/nazarov/movieslist/moviesapi/MoviesNavigator;", "navigatorsMap", "", "Ljava/lang/Class;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/nazarov/movieslist/core/NavigatorsMap;", "welcome_debug"})
@dagger.Module()
public final class ProvideNavigatorsModule {
    
    public ProvideNavigatorsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nazarov.movieslist.moviesapi.MoviesNavigator provideMoviesNavigator(@org.jetbrains.annotations.NotNull()
    @com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier()
    java.util.Map<java.lang.Class<?>, javax.inject.Provider<java.lang.Object>> navigatorsMap) {
        return null;
    }
}