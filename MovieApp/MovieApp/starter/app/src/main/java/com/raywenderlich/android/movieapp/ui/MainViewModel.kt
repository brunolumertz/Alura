package com.raywenderlich.android.movieapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.android.movieapp.framework.network.MovieRepository
import com.raywenderlich.android.movieapp.framework.network.model.Movie
import com.raywenderlich.android.movieapp.ui.movies.MovieLoadingState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MovieRepository) :
    ViewModel() {

  private var debouncePeriod: Long = 500
  private var searchJob: Job? = null
  val searchMoviesLiveData = MutableLiveData<List<Movie>>()
  val movieLoadingStateLiveData = MutableLiveData<MovieLoadingState>()



  fun onFragmentReady() {
    //TODO Fetch Popular Movies
  }

  fun onSearchQuery(query: String) {
    searchJob?.cancel()
    searchJob = viewModelScope.launch {
      delay(debouncePeriod)
      if (query.length > 2) {
        fetchMovieByQuery(query)
      }
    }
  }

  private fun fetchPopularMovies() {
    viewModelScope.launch(Dispatchers.IO) {
      val movies = repository.fetchPopularMovies()
    }
  }

  private fun fetchMovieByQuery(query: String) {
    viewModelScope.launch(Dispatchers.IO) {
      val movies = repository.fetchMovieByQuery(query)
      searchMoviesLiveData.postValue(movies)
    }
  }

  fun onMovieClicked(movie: Movie) {
    // TODO handle navigation to details screen event
  }

  override fun onCleared() {
    super.onCleared()
    searchJob?.cancel()
  }
}