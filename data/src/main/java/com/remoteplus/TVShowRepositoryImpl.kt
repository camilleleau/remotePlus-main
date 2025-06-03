package com.remoteplus

import com.remoteplus.TVApi
import com.remoteplus.TVShow
import com.remoteplus.TVShowRepository

class TVShowRepositoryImpl(
    private val api: TVApi
) : TVShowRepository {
    override suspend fun getTVShows(): List<TVShow> {
        val response = api.getTVShows() // ← retourne List<TVMazeScheduleItem>

        return response.map {
            TVShow(
                title = it.show.name ?: "Unknown Title",
                category = it.show.type ?: "Unknown Category",
                startTime = it.airtime ?: "Unknown Time"
            )
        }
    }
}
