package com.triankyy.chatapp.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.triankyy.chatapp.BottomBarScreen
import com.triankyy.chatapp.screens.home.*

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) { HomePage(navController = navController) }
        composable(route = BottomBarScreen.Profile.route) { ProfilePage(navController = navController) }
        composable(route = BottomBarScreen.Settings.route) { SettingPage(navController = navController) }
    }
}