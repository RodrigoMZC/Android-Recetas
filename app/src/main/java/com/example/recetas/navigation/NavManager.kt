package com.example.recetas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetas.views.AguachileView
import com.example.recetas.views.CoctelView
import com.example.recetas.views.HomeView
import com.example.recetas.views.PozoleView
import com.example.recetas.views.RecipeView

@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Home"
    ) {
        composable("Home") {
            HomeView(navController)
        }
        composable("Detalle") {
            RecipeView(navController)
        }
        composable("PozoleView") {
            PozoleView(navController)
        }
        composable("AguachileView") {
            AguachileView(navController)
        }
        composable("CoctelView") {
            CoctelView(navController)
        }
    }
}