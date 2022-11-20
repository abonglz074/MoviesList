package com.nazarov.movieslist.welcome.presentation.router

import com.nazarov.movieslist.coreui.router.BaseRouter
import com.nazarov.movieslist.moviesapi.MoviesNavigator
import javax.inject.Inject

class WelcomeRouter
@Inject constructor(
    private val moviesNavigator: MoviesNavigator
): BaseRouter() {

    fun openMoviesFragment() {
        getActivity { fragmentActivity ->
            moviesNavigator.openMoviesListFragment(fragmentActivity)
        }
    }
}
