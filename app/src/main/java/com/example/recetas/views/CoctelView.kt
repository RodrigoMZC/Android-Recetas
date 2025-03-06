package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.MainIconButton
import com.example.recetas.components.Spacers
import com.example.recetas.components.TitleBar
import com.example.recetas.ui.theme.FontColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoctelView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Coctel de de mariscos")
                },
                colors =
                    TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = FontColor),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }

    ) {
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacers()
            Spacers()
            Image(
                painter = painterResource(id = R.drawable.cocteldecamarones),
                contentDescription = "Coctel de mariscos",
                modifier = Modifier
                    .size(320.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(
                text = "Ingredientes",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "500 g de camarones cocidos \n" +
                        "250 g de pulpo cocido y picado \n" +
                        "250 g de almejas o mejillones cocidos \n" +
                        "1/2 taza de jugo de limón \n" +
                        "1/2 taza de salsa cátsup \n" +
                        "1/2 taza de clamato \n" +
                        "1/4 de cebolla picada \n" +
                        "1/2 taza de tomate picado \n" +
                        "1/2 taza de cilantro picado \n" +
                        "1 chile serrano picado \n" +
                        "Sal y pimienta al gusto \n" +
                        "Aguacate en cubos\n",
                        fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Spacers()
            Text(
                text = "Ingredientes",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "Mezcla el jugo de limón, la cátsup y el clamato en un tazón. \n" +
                        "Agrega los mariscos, la cebolla, el tomate, el cilantro y el chile. \n" +
                        "Revuelve bien y deja reposar 10 minutos. \n" +
                        "Sirve frío con aguacate y acompaña con galletas saladas.\n",
                        fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
        }
    }
}