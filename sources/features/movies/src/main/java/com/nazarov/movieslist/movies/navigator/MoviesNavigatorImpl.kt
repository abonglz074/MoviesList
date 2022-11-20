package com.nazarov.movieslist.movies.navigator

import androidx.fragment.app.FragmentActivity
import com.nazarov.movieslist.coreui.extensions.replaceFragment
import com.nazarov.movieslist.movies.presentation.fragment.MoviesFragment
import com.nazarov.movieslist.moviesapi.MoviesNavigator
import javax.inject.Inject

class MoviesNavigatorImpl
@Inject constructor(): MoviesNavigator {

    override fun openMoviesListFragment(fragmentActivity: FragmentActivity) {
        fragmentActivity.replaceFragment(
            addToBackStack = true,
            fragment = MoviesFragment()
        )
    }
}
