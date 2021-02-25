package com.raywenderlich.android.movieapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f2\u0006\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/raywenderlich/android/movieapp/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/movieapp/framework/network/MovieRepository;", "(Lcom/raywenderlich/android/movieapp/framework/network/MovieRepository;)V", "_popularMoviesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/raywenderlich/android/movieapp/framework/network/model/Movie;", "_searchFieldTextLiveData", "", "_searchMoviesLiveData", "Landroidx/lifecycle/LiveData;", "debouncePeriod", "", "movieLoadingStateLiveData", "Lcom/raywenderlich/android/movieapp/ui/movies/MovieLoadingState;", "getMovieLoadingStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "moviesMediatorData", "Landroidx/lifecycle/MediatorLiveData;", "getMoviesMediatorData", "()Landroidx/lifecycle/MediatorLiveData;", "searchJob", "Lkotlinx/coroutines/Job;", "fetchMovieByQuery", "query", "fetchPopularMovies", "", "onCleared", "onFragmentReady", "onMovieClicked", "movie", "onSearchQuery", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private long debouncePeriod = 500L;
    private kotlinx.coroutines.Job searchJob;
    private androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> _searchMoviesLiveData;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchFieldTextLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> _popularMoviesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> moviesMediatorData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.movieapp.ui.movies.MovieLoadingState> movieLoadingStateLiveData = null;
    private final com.raywenderlich.android.movieapp.framework.network.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> getMoviesMediatorData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.movieapp.ui.movies.MovieLoadingState> getMovieLoadingStateLiveData() {
        return null;
    }
    
    public final void onFragmentReady() {
    }
    
    public final void onSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void fetchPopularMovies() {
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.android.movieapp.framework.network.model.Movie>> fetchMovieByQuery(java.lang.String query) {
        return null;
    }
    
    public final void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.movieapp.framework.network.model.Movie movie) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.movieapp.framework.network.MovieRepository repository) {
        super();
    }
}