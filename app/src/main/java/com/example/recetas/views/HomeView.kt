package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.ActionButton
import com.example.recetas.components.CardItem
import com.example.recetas.components.TitleBar
import com.example.recetas.ui.theme.BackGround
import com.example.recetas.ui.theme.ItemColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Resetario Fancy")
                },
                colors =
                    TopAppBarDefaults.centerAlignedTopAppBarColors(
                            containerColor = ItemColor
                        )
            )
        },
        floatingActionButton = {
            ActionButton(ItemColor)
        }
    ) {
        ContentView(navController)
    }
}

//@Preview
@Composable
private fun ContentView(navController: NavController) {
    val recetas = listOf(
        Pair("Enchiladas Suizas", R.drawable.enchiladas_suizas),
        Pair("Pozole Rojo", R.drawable.pozolerojo),
        Pair("Aguachile Verde", R.drawable.aguachile_nayarit),
        Pair("Coctel de de mariscos", R.drawable.cocteldecamarones)
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(BackGround),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(recetas) { receta ->
            CardItem(
                name = receta.first,
                img = receta.second,
                onClick = {
                    navController.navigate("Detalle")
                }
            )
        }
    }
}