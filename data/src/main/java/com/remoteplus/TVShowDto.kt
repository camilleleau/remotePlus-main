package com.remoteplus

data class TVMazeScheduleItem(
    val airtime: String,
    val show: ShowInfo
)

data class ShowInfo(
    val name: String,
    val type: String
)
