// Generated by Dagger (https://dagger.dev).
package com.nazarov.movieslist.coreui.fragment;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.nazarov.movieslist.coreui.router.BaseRouter;
import com.nazarov.movieslist.coreui.viewmodel.BaseViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseRoutingFragment_MembersInjector<VB extends ViewBinding, VM extends BaseViewModel, R extends BaseRouter> implements MembersInjector<BaseRoutingFragment<VB, VM, R>> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<R> routerProvider;

  public BaseRoutingFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider, Provider<R> routerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.routerProvider = routerProvider;
  }

  public static <VB extends ViewBinding, VM extends BaseViewModel, R extends BaseRouter> MembersInjector<BaseRoutingFragment<VB, VM, R>> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider, Provider<R> routerProvider) {
    return new BaseRoutingFragment_MembersInjector<VB, VM, R>(viewModelFactoryProvider, routerProvider);
  }

  @Override
  public void injectMembers(BaseRoutingFragment<VB, VM, R> instance) {
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectRouter(instance, routerProvider.get());
  }

  @InjectedFieldSignature("com.nazarov.movieslist.coreui.fragment.BaseRoutingFragment.router")
  public static <VB extends ViewBinding, VM extends BaseViewModel, R extends BaseRouter> void injectRouter(
      BaseRoutingFragment<VB, VM, R> instance, R router) {
    instance.router = router;
  }
}
