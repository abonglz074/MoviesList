package com.nazarov.movieslist.welcome.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/nazarov/movieslist/welcome/di/WelcomeNavigatorModule;", "", "bindNavigator", "navigator", "Lcom/nazarov/movieslist/welcome/navigator/WelcomeNavigatorImpl;", "welcome_debug"})
@dagger.Module()
public abstract interface WelcomeNavigatorModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.ClassKey(value = com.nazarov.movieslist.welcomeapi.WelcomeNavigator.class)
    @com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier()
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract java.lang.Object bindNavigator(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.welcome.navigator.WelcomeNavigatorImpl navigator);
}