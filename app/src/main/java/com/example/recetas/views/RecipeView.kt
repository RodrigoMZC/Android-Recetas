package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.annotation.ContentView
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.recetas.components.TitleBar
import com.example.recetas.ui.theme.FontColor
import com.example.recetas.ui.theme.ItemColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RecipeView() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Enchiladas Suizas")
                },
                colors =
                    TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = FontColor)
            )
        }

    ) {
        ContentView()
    }
}

@Composable
private fun ContentView() {

}