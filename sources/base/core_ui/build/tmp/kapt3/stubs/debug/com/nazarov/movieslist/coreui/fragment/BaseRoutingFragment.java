package com.nazarov.movieslist.coreui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007B\u001d\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0017J\u001a\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u00028\u00028\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/nazarov/movieslist/coreui/fragment/BaseRoutingFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Lcom/nazarov/movieslist/coreui/viewmodel/BaseViewModel;", "R", "Lcom/nazarov/movieslist/coreui/router/BaseRouter;", "Lcom/nazarov/movieslist/coreui/fragment/BaseFragment;", "layoutRes", "", "viewModelClass", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "router", "getRouter", "()Lcom/nazarov/movieslist/coreui/router/BaseRouter;", "setRouter", "(Lcom/nazarov/movieslist/coreui/router/BaseRouter;)V", "Lcom/nazarov/movieslist/coreui/router/BaseRouter;", "onDestroy", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "core_ui_debug"})
public abstract class BaseRoutingFragment<VB extends androidx.viewbinding.ViewBinding, VM extends com.nazarov.movieslist.coreui.viewmodel.BaseViewModel, R extends com.nazarov.movieslist.coreui.router.BaseRouter> extends com.nazarov.movieslist.coreui.fragment.BaseFragment<VB, VM> {
    private final int layoutRes = 0;
    @javax.inject.Inject()
    public R router;
    
    public BaseRoutingFragment(@androidx.annotation.LayoutRes()
    int layoutRes, @org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> viewModelClass) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final R getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    R p0) {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onDestroy() {
    }
}