package com.triankyy.chatapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.triankyy.chatapp.graphs.Graph

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(null)
}

@Composable
fun LoginScreen(navController: NavHostController?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navController!!.popBackStack()
                navController.navigate(Graph.HOME)
            },
            text = "Halaman Login",
            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}