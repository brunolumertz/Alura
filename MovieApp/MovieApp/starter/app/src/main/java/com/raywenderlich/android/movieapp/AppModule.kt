package com.raywenderlich.android.movieapp

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val movieApplication: Application) {

  @Provides
  @Singleton
  fun provideContext(): Application = movieApplication
}