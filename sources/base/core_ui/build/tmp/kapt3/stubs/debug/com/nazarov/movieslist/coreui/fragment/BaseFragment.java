package com.nazarov.movieslist.coreui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u001d\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001eH$\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H$J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020!H\u0016J\u001a\u0010/\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0017R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00060"}, d2 = {"Lcom/nazarov/movieslist/coreui/fragment/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Lcom/nazarov/movieslist/coreui/viewmodel/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "layoutRes", "", "viewModelClass", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "viewModel", "getViewModel", "()Lcom/nazarov/movieslist/coreui/viewmodel/BaseViewModel;", "setViewModel", "(Lcom/nazarov/movieslist/coreui/viewmodel/BaseViewModel;)V", "Lcom/nazarov/movieslist/coreui/viewmodel/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "initBinding", "view", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "initDaggerComponent", "", "dependenciesProvider", "Lcom/nazarov/movieslist/core/DependenciesProvider;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "core_ui_debug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding, VM extends com.nazarov.movieslist.coreui.viewmodel.BaseViewModel> extends androidx.fragment.app.Fragment {
    private final int layoutRes = 0;
    private final java.lang.Class<VM> viewModelClass = null;
    protected VM viewModel;
    private VB _binding;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layoutRes, @org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> viewModelClass) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void initDaggerComponent(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.core.DependenciesProvider dependenciesProvider);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VB initBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view);
}