package com.remoteplus

data class TVShow(
    val title: String,
    val category: String,
    val startTime: String,
    val season: Int,
    val episode: Int,
    val network: String,
    val imageUrl: String?
)
