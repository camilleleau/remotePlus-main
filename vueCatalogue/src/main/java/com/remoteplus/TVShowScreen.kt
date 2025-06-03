package com.remoteplus

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun TVShowScreen(viewModel: TVShowViewModel) {
    val tvShows by viewModel.tvShows.collectAsState()

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()) {

        Text("Catalogue TV", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(tvShows) { show ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Row(modifier = Modifier.padding(12.dp)) {
                        AsyncImage(
                            model = show.imageUrl,
                            contentDescription = null,
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 12.dp)
                        )
                        Column {
                            Text(text = show.title, style = MaterialTheme.typography.titleMedium)
                            Text(text = "${show.category} • ${show.channel}", style = MaterialTheme.typography.bodySmall)
                            Text(text = "Saison ${show.season} • Épisode ${show.episode}", style = MaterialTheme.typography.bodySmall)
                            Text(text = "À ${show.startTime}", style = MaterialTheme.typography.labelSmall)
                        }
                    }
                }
            }
        }
    }
}