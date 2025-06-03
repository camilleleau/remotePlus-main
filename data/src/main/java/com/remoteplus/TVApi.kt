package com.remoteplus

import retrofit2.http.GET
import retrofit2.http.Query
import com.remoteplus.TVMazeScheduleItem
import com.remoteplus.ShowInfo
import java.time.LocalDate

interface TVApi {
    @GET("schedule")
    suspend fun getTVShows(
        @Query("date") date: String
    ): List<TVMazeScheduleItem>
}
