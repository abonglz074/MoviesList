// Generated by Dagger (https://dagger.dev).
package com.nazarov.movieslist.welcome.di;

import androidx.lifecycle.ViewModel;
import com.nazarov.movieslist.core.DependenciesProvider;
import com.nazarov.movieslist.core.di.ViewModelFactory;
import com.nazarov.movieslist.coreui.fragment.BaseFragment_MembersInjector;
import com.nazarov.movieslist.coreui.fragment.BaseRoutingFragment_MembersInjector;
import com.nazarov.movieslist.moviesapi.MoviesNavigator;
import com.nazarov.movieslist.welcome.presentation.fragment.WelcomeFragment;
import com.nazarov.movieslist.welcome.presentation.router.WelcomeRouter;
import com.nazarov.movieslist.welcome.presentation.viewmodel.WelcomeViewModel;
import com.nazarov.movieslist.welcome.presentation.viewmodel.WelcomeViewModel_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerWelcomeComponent {
  private DaggerWelcomeComponent() {
  }

  public static WelcomeComponent.Factory factory() {
    return new Factory();
  }

  private static final class Factory implements WelcomeComponent.Factory {
    @Override
    public WelcomeComponent create(DependenciesProvider dependenciesProvider) {
      Preconditions.checkNotNull(dependenciesProvider);
      return new WelcomeComponentImpl(new ProvideNavigatorsModule(), dependenciesProvider);
    }
  }

  private static final class WelcomeComponentImpl implements WelcomeComponent {
    private final ProvideNavigatorsModule provideNavigatorsModule;

    private final DependenciesProvider dependenciesProvider;

    private final WelcomeComponentImpl welcomeComponentImpl = this;

    private WelcomeComponentImpl(ProvideNavigatorsModule provideNavigatorsModuleParam,
        DependenciesProvider dependenciesProviderParam) {
      this.provideNavigatorsModule = provideNavigatorsModuleParam;
      this.dependenciesProvider = dependenciesProviderParam;

    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel(
        ) {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(WelcomeViewModel.class, ((Provider) WelcomeViewModel_Factory.create()));
    }

    private ViewModelFactory viewModelFactory() {
      return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
    }

    private MoviesNavigator moviesNavigator() {
      return ProvideNavigatorsModule_ProvideMoviesNavigatorFactory.provideMoviesNavigator(provideNavigatorsModule, Preconditions.checkNotNullFromComponent(dependenciesProvider.provideNavigatorsMap()));
    }

    private WelcomeRouter welcomeRouter() {
      return new WelcomeRouter(moviesNavigator());
    }

    @Override
    public void inject(WelcomeFragment welcomeFragment) {
      injectWelcomeFragment(welcomeFragment);
    }

    private WelcomeFragment injectWelcomeFragment(WelcomeFragment instance) {
      BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactory());
      BaseRoutingFragment_MembersInjector.injectRouter(instance, welcomeRouter());
      return instance;
    }
  }
}