package com.nazarov.movieslist.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/nazarov/movieslist/network/NetworkComponent;", "Lcom/nazarov/movieslist/core/NetworkProvider;", "Companion", "Factory", "network_debug"})
@dagger.Component(dependencies = {com.nazarov.movieslist.core.AndroidDependenciesProvider.class}, modules = {com.nazarov.movieslist.network.HttpUrlModule.class, com.nazarov.movieslist.network.NetworkModule.class})
public abstract interface NetworkComponent extends com.nazarov.movieslist.core.NetworkProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.nazarov.movieslist.network.NetworkComponent.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nazarov/movieslist/network/NetworkComponent$Factory;", "", "create", "Lcom/nazarov/movieslist/core/NetworkProvider;", "androidDependenciesProvider", "Lcom/nazarov/movieslist/core/AndroidDependenciesProvider;", "network_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.nazarov.movieslist.core.NetworkProvider create(@org.jetbrains.annotations.NotNull()
        com.nazarov.movieslist.core.AndroidDependenciesProvider androidDependenciesProvider);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nazarov/movieslist/network/NetworkComponent$Companion;", "", "()V", "init", "Lcom/nazarov/movieslist/core/NetworkProvider;", "androidDependenciesProvider", "Lcom/nazarov/movieslist/core/AndroidDependenciesProvider;", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.nazarov.movieslist.core.NetworkProvider init(@org.jetbrains.annotations.NotNull()
        com.nazarov.movieslist.core.AndroidDependenciesProvider androidDependenciesProvider) {
            return null;
        }
    }
}