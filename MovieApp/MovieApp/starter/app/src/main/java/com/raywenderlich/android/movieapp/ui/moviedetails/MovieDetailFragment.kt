package com.raywenderlich.android.movieapp.ui.movie_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.raywenderlich.android.movieapp.R
import kotlinx.android.synthetic.main.fragment_movie_details.*

class MovieDetailFragment : Fragment(R.layout.fragment_movie_details) {

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    initialiseUIElements()
  }

  private fun initialiseUIElements() {
    arguments?.let {
      movieNameTextView.text = MovieDetailFragmentArgs.fromBundle(it).movieName
    }
  }
}