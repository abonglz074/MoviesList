package com.nazarov.movieslist.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nazarov/movieslist/core/App;", "", "cleanComponent", "", "getDependenciesProvider", "Lcom/nazarov/movieslist/core/DependenciesProvider;", "core_debug"})
public abstract interface App {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nazarov.movieslist.core.DependenciesProvider getDependenciesProvider();
    
    public abstract void cleanComponent();
}