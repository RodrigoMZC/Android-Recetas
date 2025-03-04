package com.example.recetas.views

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
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
fun RecipeView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Enchiladas Suizas")
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
                painter = painterResource(id = R.drawable.enchiladas_suizas),
                contentDescription = "Enchiladas Suizas",
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
                text = "12 tortillas de maíz \n" +
                        "2 tazas de pollo deshebrado \n" +
                        "1 taza de crema ácida \n" +
                        "1 taza de queso manchego rallado\n" +
                        "1 taza de salsa verde\n" +
                        "1/2 taza de caldo de pollo\n" +
                        "1/4 de cebolla picada\n" +
                        "1 diente de ajo picado\n" +
                        "1 cucharada de aceite\n" +
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
                text = "1. Calienta el aceite en un sartén y sofríe la cebolla y el ajo.\n" +
                        "2. Agrega la salsa verde y el caldo de pollo, cocina por 5 minutos. \n" +
                        "3. Sumerge las tortillas en la salsa y rellénalas con pollo deshebrado.\n" +
                        "4. Enrolla las tortillas y colócalas en un refractario engrasado.\n" +
                        "5. Cubre con crema y queso rallado.\n" +
                        "6. Hornea a 180°C por 15 minutos hasta que el queso gratine.\n" +
                        "7. Sirve caliente y disfruta.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
        }
    }
}
