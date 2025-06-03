package com.remoteplus

class GetTVShowsUseCaseImpl(
    private val repository: TVShowRepository
) : GetTVShowsUseCase {
    override suspend fun getTVShows(): List<TVShow> {
        return repository.getTVShows()
    }
}
