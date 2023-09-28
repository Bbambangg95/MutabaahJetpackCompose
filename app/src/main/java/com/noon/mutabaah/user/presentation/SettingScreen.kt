package com.noon.mutabaah.user.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@ExperimentalMaterial3Api
fun SettingScreen (
    navController: NavController
) {
    Scaffold (
        topBar = {
            TopAppBar(title = {
                Text(text = "Setting")
            })
        }
    ) {
        Column (
            modifier = Modifier
                .padding(it)
        ) {
            Text(text = "Setting Body")
        }
    }
}