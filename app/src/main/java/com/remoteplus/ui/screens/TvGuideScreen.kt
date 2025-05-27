package com.remoteplus.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TvGuideScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("En tête tel", style = MaterialTheme.typography.headlineSmall)

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            for (row in 0 until 5) {
                Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
                    for (col in 1..2) {
                        val index = row * 2 + col
                        Button(onClick = { /* TODO: Changer de chaîne */ }, modifier = Modifier.weight(1f)) {
                            Text("Chaîne $index")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /* TODO: Quitter */ }) {
                Text("Quitter")
            }
            Button(onClick = { navController.popBackStack() }) {
                Text("Retour")
            }
        }
    }
}
