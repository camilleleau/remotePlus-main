package com.remoteplus

import com.remoteplus.TVShow

interface TVShowRepository {
    suspend fun getTVShows(): List<TVShow>
}
