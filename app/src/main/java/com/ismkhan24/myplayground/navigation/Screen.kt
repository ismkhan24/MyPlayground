package com.ismkhan24.myplayground.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Biometric : Screen("biometric")
}
