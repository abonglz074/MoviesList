// Generated by Dagger (https://dagger.dev).
package com.nazarov.movieslist.welcome.di;

import com.nazarov.movieslist.moviesapi.MoviesNavigator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("com.nazarov.movieslist.core.qualifiers.NavigatorsQualifier")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProvideNavigatorsModule_ProvideMoviesNavigatorFactory implements Factory<MoviesNavigator> {
  private final ProvideNavigatorsModule module;

  private final Provider<Map<Class<?>, Provider<Object>>> navigatorsMapProvider;

  public ProvideNavigatorsModule_ProvideMoviesNavigatorFactory(ProvideNavigatorsModule module,
      Provider<Map<Class<?>, Provider<Object>>> navigatorsMapProvider) {
    this.module = module;
    this.navigatorsMapProvider = navigatorsMapProvider;
  }

  @Override
  public MoviesNavigator get() {
    return provideMoviesNavigator(module, navigatorsMapProvider.get());
  }

  public static ProvideNavigatorsModule_ProvideMoviesNavigatorFactory create(
      ProvideNavigatorsModule module,
      Provider<Map<Class<?>, Provider<Object>>> navigatorsMapProvider) {
    return new ProvideNavigatorsModule_ProvideMoviesNavigatorFactory(module, navigatorsMapProvider);
  }

  public static MoviesNavigator provideMoviesNavigator(ProvideNavigatorsModule instance,
      Map<Class<?>, Provider<Object>> navigatorsMap) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoviesNavigator(navigatorsMap));
  }
}
