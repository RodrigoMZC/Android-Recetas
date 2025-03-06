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
fun PozoleView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Pozole Rojo")
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
                painter = painterResource(id = R.drawable.pozolerojo),
                contentDescription = "Pozole Rojo",
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
                text = "1 kg de maíz pozolero precocido \n" +
                        "1 kg de carne de cerdo (espinazo o pierna) \n" +
                        "2 chiles guajillo desvenados y remojados \n" +
                        "2 chiles ancho desvenados y remojados\n" +
                        "1/2 cebolla\n" +
                        "2 dientes de ajo\n" +
                        "2 litros de agua\n" +
                        "1 cucharadita de orégano\n" +
                        "Rábanos en rodajas\n" +
                        "Lechuga picada\n" +
                        "Cebolla picada\n" +
                        "Limones partidos\n" +
                        "Sal y pimienta al gusto",
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
                text = "Hierve el maíz en agua hasta que reviente.\n" +
                        "Cuece la carne con cebolla, ajo y sal hasta que esté suave. \n" +
                        "Licúa los chiles con un poco de agua y cuélalos.\n" +
                        "Agrega la carne desmenuzada y la salsa de chiles al maíz.\n" +
                        "Cocina por 30 minutos más, ajusta la sal y el orégano.\n" +
                        "Sirve con rábanos, lechuga, cebolla y limón.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
        }
    }
}
