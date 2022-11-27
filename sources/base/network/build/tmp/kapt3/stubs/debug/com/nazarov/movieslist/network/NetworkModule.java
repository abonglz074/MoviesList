package com.nazarov.movieslist.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J*\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/nazarov/movieslist/network/NetworkModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "gson", "okHttpClient", "baseUrl", "", "network_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @dagger.Provides()
    @com.nazarov.movieslist.core.qualifiers.RestApi()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    @com.nazarov.movieslist.core.qualifiers.RestApi()
    java.lang.String baseUrl) {
        return null;
    }
    
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
}