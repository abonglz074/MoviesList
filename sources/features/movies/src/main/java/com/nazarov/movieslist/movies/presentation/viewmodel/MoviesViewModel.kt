package com.nazarov.movieslist.movies.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nazarov.movieslist.core.network.ResponseStatus
import com.nazarov.movieslist.coreui.viewmodel.BaseViewModel
import com.nazarov.movieslist.movies.domain.entities.MoviesListResponse
import com.nazarov.movieslist.movies.domain.usecases.RequestMoviesListUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MoviesViewModel
@Inject constructor(
    private val moviesListUseCase: RequestMoviesListUseCase
): BaseViewModel() {

    val navigateBack: LiveData<Unit>
        get() = _navigateBack
    private var _navigateBack = MutableLiveData<Unit>()

    val progressBar: LiveData<Boolean>
        get() = _progressBar
    private var _progressBar = MutableLiveData<Boolean>()

    val errorMessage: LiveData<String?>
        get() = _errorMessage
    private var _errorMessage = MutableLiveData<String?>()

    val moviesList: LiveData<MoviesListResponse>
        get() = _moviesList
    private var _moviesList = MutableLiveData<MoviesListResponse>()

    fun onBackButtonClicked() {
        _navigateBack.value = Unit
    }

    fun getMoviesList() {
        viewModelScope.launch {
            when(val response = moviesListUseCase.invoke()) {
                is ResponseStatus.Success -> _moviesList.postValue(response.data)
                is ResponseStatus.Error -> _errorMessage.postValue(response.message)
                is ResponseStatus.Loading -> _progressBar.postValue(response.isLoading)
            }
        }
    }
}
