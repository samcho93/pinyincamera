package com.project.chinesepinyin;

import com.google.mlkit.vision.text.TextRecognizer;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<TextRecognizer> textRecognizerProvider;

  public MainActivity_MembersInjector(Provider<TextRecognizer> textRecognizerProvider) {
    this.textRecognizerProvider = textRecognizerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<TextRecognizer> textRecognizerProvider) {
    return new MainActivity_MembersInjector(textRecognizerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectTextRecognizer(instance, textRecognizerProvider.get());
  }

  @InjectedFieldSignature("com.project.chinesepinyin.MainActivity.textRecognizer")
  public static void injectTextRecognizer(MainActivity instance, TextRecognizer textRecognizer) {
    instance.textRecognizer = textRecognizer;
  }
}
