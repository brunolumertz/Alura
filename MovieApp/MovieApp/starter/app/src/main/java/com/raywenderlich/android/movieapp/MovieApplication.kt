package com.raywenderlich.android.movieapp

import android.app.Application
import com.raywenderlich.android.movieapp.framework.network.MovieApiModule

class MovieApplication : Application() {

  lateinit var appComponent: AppComponent

  private fun initAppComponent(app: MovieApplication): AppComponent {
    return DaggerAppComponent.builder()
        .appModule(AppModule(app))
        .movieApiModule(MovieApiModule()).build()
  }

  companion object {
    @get:Synchronized
    lateinit var application: MovieApplication
      private set
  }

  override fun onCreate() {
    super.onCreate()
    application = this
    appComponent = initAppComponent(this)
  }
}