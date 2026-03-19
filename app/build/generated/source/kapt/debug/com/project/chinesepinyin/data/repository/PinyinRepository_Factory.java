package com.project.chinesepinyin.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class PinyinRepository_Factory implements Factory<PinyinRepository> {
  @Override
  public PinyinRepository get() {
    return newInstance();
  }

  public static PinyinRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PinyinRepository newInstance() {
    return new PinyinRepository();
  }

  private static final class InstanceHolder {
    private static final PinyinRepository_Factory INSTANCE = new PinyinRepository_Factory();
  }
}
