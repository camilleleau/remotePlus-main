package com.remoteplus

interface GetTVShowsUseCase {
    suspend fun getTVShows(): List<TVShow>
}