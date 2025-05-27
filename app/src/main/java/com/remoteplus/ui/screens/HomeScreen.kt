package com.remoteplus.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("En tête tel", style = MaterialTheme.typography.headlineSmall)

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate("remote") }, modifier = Modifier.fillMaxWidth()) {
                Text("Télécommande")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("guide") }, modifier = Modifier.fillMaxWidth()) {
                Text("Programme TV")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /* TODO: Quitter */ }) {
                Text("Quitter")
            }
            Button(onClick = { /* TODO: Retour */ }) {
                Text("Retour")
            }
        }
    }
}
