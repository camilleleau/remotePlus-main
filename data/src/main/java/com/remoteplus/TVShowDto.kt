package com.remoteplus

data class TVMazeScheduleItem(
    val airtime: String,
    val season: Int?,
    val number: Int?,
    val show: ShowInfo
)

data class ShowInfo(
    val name: String?,
    val type: String?,
    val network: NetworkInfo?,
    val image: ImageInfo?
)

data class NetworkInfo(
    val name: String?
)

data class ImageInfo(
    val medium: String?,
    val original: String?
)


