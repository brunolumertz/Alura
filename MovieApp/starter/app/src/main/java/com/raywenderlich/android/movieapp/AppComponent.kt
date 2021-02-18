package com.raywenderlich.android.movieapp

import com.raywenderlich.android.movieapp.framework.network.MovieApiModule
import com.raywenderlich.android.movieapp.ui.MainActivity
import com.raywenderlich.android.movieapp.ui.ViewModelModule
import com.raywenderlich.android.movieapp.ui.movies.MovieListFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, MovieApiModule::class, ViewModelModule::class])
interface AppComponent {
  fun inject(mainActivity: MainActivity)
  fun inject(movieListFragment: MovieListFragment)
}