package com.remoteplus

import com.remoteplus.TVApi
import com.remoteplus.TVShow
import com.remoteplus.TVShowRepository
import java.time.LocalDate

class TVShowRepositoryImpl(
    private val api: TVApi
) : TVShowRepository {
    override suspend fun getTVShows(): List<TVShow> {
        val today = LocalDate.now().toString()
        val response = api.getTVShows(date = today)
        return response.map {
            TVShow(
                title = it.show.name ?: "Unknown Title",
                category = it.show.type ?: "Unknown Category",
                startTime = it.airtime ?: "Unknown Time",
                season = it.season ?: 0,
                episode = it.number ?: 0,
                network = it.show.network?.name ?: "Unknown Network",
                channel = it.show.network?.name ?: "Inconnu",
                imageUrl = it.show.image?.medium
            )
        }
    }
}
