// Generated by Dagger (https://dagger.dev).
package com.nazarov.movieslist.network;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata("com.nazarov.movieslist.core.qualifiers.RestApi")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> baseUrlProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module, Provider<Gson> gsonProvider,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> baseUrlProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpClientProvider = okHttpClientProvider;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, gsonProvider.get(), okHttpClientProvider.get(), baseUrlProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseUrlProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, gsonProvider, okHttpClientProvider, baseUrlProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, Gson gson,
      OkHttpClient okHttpClient, String baseUrl) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(gson, okHttpClient, baseUrl));
  }
}
