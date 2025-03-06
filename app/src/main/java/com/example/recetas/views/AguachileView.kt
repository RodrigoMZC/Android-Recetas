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
fun AguachileView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Aguachile")
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
                painter = painterResource(id = R.drawable.aguachile_nayarit),
                contentDescription = "Aguachile",
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
                text = "500 g de camarones crudos y limpios \n" +
                        "1/2 taza de jugo de limón \n" +
                        "1/2 taza de pepino en rodajas \n" +
                        "1/2 taza de cilantro\n" +
                        "1 chile serrano\n" +
                        "1 diente de ajo\n" +
                        "1/4 de cebolla\n" +
                        "Sal y pimienta al gusto\n" +
                        "Aguacate en rodajas\n",
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
                text = "Licúa el jugo de limón con el cilantro, chile, ajo y cebolla.\n" +
                        "Coloca los camarones en un recipiente y cúbrelos con la salsa. \n" +
                        "Refrigera por 15-20 minutos hasta que los camarones cambien de color.\n" +
                        "Sirve con pepino, aguacate y acompaña con tostadas.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
        }
    }
}
