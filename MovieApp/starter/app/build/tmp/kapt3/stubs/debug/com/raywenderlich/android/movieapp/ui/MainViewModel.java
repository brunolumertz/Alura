package com.raywenderlich.android.movieapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0014J\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/raywenderlich/android/movieapp/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/movieapp/framework/network/MovieRepository;", "(Lcom/raywenderlich/android/movieapp/framework/network/MovieRepository;)V", "debouncePeriod", "", "searchJob", "Lkotlinx/coroutines/Job;", "fetchMovieByQuery", "", "query", "", "fetchPopularMovies", "onCleared", "onFragmentReady", "onMovieClicked", "movie", "Lcom/raywenderlich/android/movieapp/framework/network/model/Movie;", "onSearchQuery", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private long debouncePeriod = 500L;
    private kotlinx.coroutines.Job searchJob;
    private final com.raywenderlich.android.movieapp.framework.network.MovieRepository repository = null;
    
    public final void onFragmentReady() {
    }
    
    public final void onSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void fetchPopularMovies() {
    }
    
    private final void fetchMovieByQuery(java.lang.String query) {
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