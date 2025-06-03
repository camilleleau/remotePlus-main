package com.remoteplus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TVShowViewModel(
    private val useCase: GetTVShowsUseCase
) : ViewModel() {

    private val _tvShows = MutableStateFlow<List<TVShow>>(emptyList())
    val tvShows: StateFlow<List<TVShow>> = _tvShows

    init {
        viewModelScope.launch {
            _tvShows.value = useCase.getTVShows()
        }
    }
}

class TVShowViewModelFactory(
    private val useCase: GetTVShowsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TVShowViewModel(useCase) as T
    }
}
