package com.noon.mutabaah.student.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun StudentScreen(
    navController: NavController
) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Student",
                        fontWeight = FontWeight.Bold
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.TwoTone.Add, contentDescription = "New Student")
            }
        }
    ) {
        Column (
            modifier = Modifier
                .padding(it)
        ) {
            ListItem(
                headlineText = {
                    Text( text = "Muhammad Albar")
                },
                supportingText = {
                    Text("Ziyadah")
                },
                trailingContent = {
                    Icon(imageVector = Icons.TwoTone.KeyboardArrowRight, contentDescription = "Detail")
                }
            )
        }
    }
}