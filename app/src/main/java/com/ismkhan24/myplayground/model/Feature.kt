package com.ismkhan24.myplayground.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Feature(
    val id: String,
    val title: String,
    val description: String,
    val icon: ImageVector,
    val route: String
)
