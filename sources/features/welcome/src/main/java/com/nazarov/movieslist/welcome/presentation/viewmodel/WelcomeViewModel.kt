package com.nazarov.movieslist.welcome.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nazarov.movieslist.coreui.viewmodel.BaseViewModel
import javax.inject.Inject

class WelcomeViewModel
@Inject constructor() : BaseViewModel() {

    val navigateToMoviesList: LiveData<Unit>
        get() = _navigateToMoviesList
    private var _navigateToMoviesList = MutableLiveData<Unit>()

    fun onNavigateToMoviesListClicked() {
        _navigateToMoviesList.value = Unit
    }
}
