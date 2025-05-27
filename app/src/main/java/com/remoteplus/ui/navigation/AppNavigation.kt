package com.remoteplus.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.remoteplus.ui.screens.HomeScreen
import com.remoteplus.ui.screens.RemoteScreen
import com.remoteplus.ui.screens.TvGuideScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("remote") { RemoteScreen(navController) }
        composable("guide") { TvGuideScreen(navController) }
    }
}
