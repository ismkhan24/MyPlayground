package com.ismkhan24.myplayground.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ismkhan24.myplayground.ui.screens.biometric.BiometricScreen
import com.ismkhan24.myplayground.ui.screens.home.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onFeatureClick = { route ->
                    navController.navigate(route)
                }
            )
        }

        composable(Screen.Biometric.route) {
            BiometricScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
