package com.triankyy.chatapp.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.triankyy.chatapp.screens.LoginScreen
import com.triankyy.chatapp.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) { LoginScreen(navController) }
        composable(route = AuthScreen.SignUp.route) { SignUpScreen(navController) }
    }
}

sealed class AuthScreen(val route: String) {
    object Login: AuthScreen(route = "LOGIN")
    object SignUp: AuthScreen(route = "SIGN_UP")
}