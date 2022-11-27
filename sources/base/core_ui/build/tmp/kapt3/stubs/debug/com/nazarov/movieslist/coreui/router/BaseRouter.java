package com.nazarov.movieslist.coreui.router;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ+\u0010\n\u001a\u00020\b2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\b0\fH\u0004J\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/nazarov/movieslist/coreui/router/BaseRouter;", "", "()V", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "bindActivity", "", "finish", "getActivity", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "unbindActivity", "unbindFragmentManager", "core_ui_debug"})
public abstract class BaseRouter {
    private androidx.fragment.app.FragmentActivity fragmentActivity;
    private androidx.fragment.app.FragmentManager fragmentManager;
    
    public BaseRouter() {
        super();
    }
    
    protected final void getActivity(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentActivity, kotlin.Unit> action) {
    }
    
    public final void bindActivity(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity) {
    }
    
    public final void unbindActivity() {
    }
    
    public final void unbindFragmentManager() {
    }
    
    public final void finish() {
    }
}