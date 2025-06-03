package com.remoteplus

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TVShowScreen(viewModel: TVShowViewModel) {
    val tvShows by viewModel.tvShows.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Catalogue TV", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        tvShows.forEach {
            Text("${it.title} - ${it.category} à ${it.startTime}")
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
