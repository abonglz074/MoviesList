package com.nazarov.movieslist.core.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011B)\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/nazarov/movieslist/core/network/ResponseStatus;", "T", "", "isLoading", "", "data", "message", "", "(ZLjava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "()Z", "getMessage", "()Ljava/lang/String;", "Error", "Loading", "Success", "Lcom/nazarov/movieslist/core/network/ResponseStatus$Error;", "Lcom/nazarov/movieslist/core/network/ResponseStatus$Loading;", "Lcom/nazarov/movieslist/core/network/ResponseStatus$Success;", "core_debug"})
public abstract class ResponseStatus<T extends java.lang.Object> {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    
    private ResponseStatus(boolean isLoading, T data, java.lang.String message) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/nazarov/movieslist/core/network/ResponseStatus$Loading;", "T", "Lcom/nazarov/movieslist/core/network/ResponseStatus;", "()V", "core_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.nazarov.movieslist.core.network.ResponseStatus<T> {
        
        public Loading() {
            super(false, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/nazarov/movieslist/core/network/ResponseStatus$Success;", "T", "Lcom/nazarov/movieslist/core/network/ResponseStatus;", "data", "(Ljava/lang/Object;)V", "core_debug"})
    public static final class Success<T extends java.lang.Object> extends com.nazarov.movieslist.core.network.ResponseStatus<T> {
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data) {
            super(false, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/nazarov/movieslist/core/network/ResponseStatus$Error;", "T", "Lcom/nazarov/movieslist/core/network/ResponseStatus;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class Error<T extends java.lang.Object> extends com.nazarov.movieslist.core.network.ResponseStatus<T> {
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(false, null, null);
        }
    }
}