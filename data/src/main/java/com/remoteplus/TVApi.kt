package com.remoteplus

import retrofit2.http.GET

interface TVApi {
    @GET("schedule?country=FR")
    suspend fun getTVShows(): List<TVMazeScheduleItem>
}
