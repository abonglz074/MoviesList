package com.nazarov.movieslist.welcome.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/nazarov/movieslist/welcome/di/WelcomeComponent;", "", "inject", "", "welcomeFragment", "Lcom/nazarov/movieslist/welcome/presentation/fragment/WelcomeFragment;", "Companion", "Factory", "welcome_debug"})
@dagger.Component(dependencies = {com.nazarov.movieslist.core.DependenciesProvider.class}, modules = {com.nazarov.movieslist.core.di.ViewModelFactoryModule.class, com.nazarov.movieslist.welcome.di.WelcomeViewModelModule.class, com.nazarov.movieslist.welcome.di.ProvideNavigatorsModule.class})
@com.nazarov.movieslist.core.scopes.FeatureScope()
public abstract interface WelcomeComponent {
    @org.jetbrains.annotations.NotNull()
    public static final com.nazarov.movieslist.welcome.di.WelcomeComponent.Companion Companion = null;
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.welcome.presentation.fragment.WelcomeFragment welcomeFragment);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nazarov/movieslist/welcome/di/WelcomeComponent$Factory;", "", "create", "Lcom/nazarov/movieslist/welcome/di/WelcomeComponent;", "dependenciesProvider", "Lcom/nazarov/movieslist/core/DependenciesProvider;", "welcome_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.nazarov.movieslist.welcome.di.WelcomeComponent create(@org.jetbrains.annotations.NotNull()
        com.nazarov.movieslist.core.DependenciesProvider dependenciesProvider);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nazarov/movieslist/welcome/di/WelcomeComponent$Companion;", "", "()V", "init", "Lcom/nazarov/movieslist/welcome/di/WelcomeComponent;", "dependenciesProvider", "Lcom/nazarov/movieslist/core/DependenciesProvider;", "welcome_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.nazarov.movieslist.welcome.di.WelcomeComponent init(@org.jetbrains.annotations.NotNull()
        com.nazarov.movieslist.core.DependenciesProvider dependenciesProvider) {
            return null;
        }
    }
}