package com.raywenderlich.android.movieapp.ui

import androidx.lifecycle.*
import com.bumptech.glide.Glide.init
import com.raywenderlich.android.movieapp.framework.network.MovieRepository
import com.raywenderlich.android.movieapp.framework.network.model.Movie
import com.raywenderlich.android.movieapp.ui.movies.MovieLoadingState
import kotlinx.coroutines.*
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MovieRepository) :
    ViewModel() {

  private var debouncePeriod: Long = 500
  private var searchJob: Job? = null
  //1
  //3
  private var _searchMoviesLiveData: LiveData<List<Movie>>

  //2
  private val _searchFieldTextLiveData = MutableLiveData<String>()

  //1
  private val _popularMoviesLiveData = MutableLiveData<List<Movie>>()

  //2
  val moviesMediatorData = MediatorLiveData<List<Movie>>()


  val movieLoadingStateLiveData = MutableLiveData<MovieLoadingState>()

  //3
  init {
    _searchMoviesLiveData = Transformations.switchMap(_searchFieldTextLiveData) {
      fetchMovieByQuery(it)
    }

    //1
    moviesMediatorData.addSource(_popularMoviesLiveData) {
      moviesMediatorData.value = it
    }

    //2
    moviesMediatorData.addSource(_searchMoviesLiveData) {
      moviesMediatorData.value = it
    }
  }



  fun onFragmentReady() {
    //3
    fetchPopularMovies()

  }

  fun onSearchQuery(query: String) {
    searchJob?.cancel()
    searchJob = viewModelScope.launch {
      delay(debouncePeriod)
      if (query.length > 2) {
        //4
        _searchFieldTextLiveData.value = query
      }
    }
  }

  private fun fetchPopularMovies() {
    //1
    movieLoadingStateLiveData.value = MovieLoadingState.LOADING
    viewModelScope.launch(Dispatchers.IO) {
      try {
        //2
        val movies = repository.fetchPopularMovies()
        _popularMoviesLiveData.postValue(movies)

        //3
        movieLoadingStateLiveData.postValue(MovieLoadingState.LOADED)
      } catch (e: Exception) {
        //4
        movieLoadingStateLiveData.postValue(MovieLoadingState.INVALID_API_KEY)
      }
    }
  }


  //1
  private fun fetchMovieByQuery(query: String): LiveData<List<Movie>> {
    //2
    val liveData = MutableLiveData<List<Movie>>()
    viewModelScope.launch(Dispatchers.IO) {
      val movies = repository.fetchMovieByQuery(query)
      //3
      liveData.postValue(movies)
    }
    //4
    return liveData
  }




  fun onMovieClicked(movie: Movie) {
    // TODO handle navigation to details screen event
  }

  override fun onCleared() {
    super.onCleared()
    searchJob?.cancel()
  }
}