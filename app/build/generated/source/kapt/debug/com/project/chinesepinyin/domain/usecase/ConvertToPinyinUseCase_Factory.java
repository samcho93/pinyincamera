package com.project.chinesepinyin.domain.usecase;

import com.project.chinesepinyin.data.repository.PinyinRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ConvertToPinyinUseCase_Factory implements Factory<ConvertToPinyinUseCase> {
  private final Provider<PinyinRepository> pinyinRepositoryProvider;

  public ConvertToPinyinUseCase_Factory(Provider<PinyinRepository> pinyinRepositoryProvider) {
    this.pinyinRepositoryProvider = pinyinRepositoryProvider;
  }

  @Override
  public ConvertToPinyinUseCase get() {
    return newInstance(pinyinRepositoryProvider.get());
  }

  public static ConvertToPinyinUseCase_Factory create(
      Provider<PinyinRepository> pinyinRepositoryProvider) {
    return new ConvertToPinyinUseCase_Factory(pinyinRepositoryProvider);
  }

  public static ConvertToPinyinUseCase newInstance(PinyinRepository pinyinRepository) {
    return new ConvertToPinyinUseCase(pinyinRepository);
  }
}
