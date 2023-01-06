package com.triankyy.chatapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home: BottomBarScreen(
        route = "HOME",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Profile: BottomBarScreen(
        route = "PROFILE",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object Settings: BottomBarScreen(
        route = "SETTINGS",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}