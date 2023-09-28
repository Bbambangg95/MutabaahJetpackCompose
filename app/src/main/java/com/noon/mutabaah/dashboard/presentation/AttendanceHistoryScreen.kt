package com.noon.mutabaah.dashboard.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun AttendanceHistoryScreen (
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Attendance Detail Screen")
                },
                navigationIcon = {

                }
            )
        }
    ) {
        Column (
            modifier = Modifier
                .padding(it)
        ) {
            Text(text = "Attendance Detail Screen")
            Button(
                onClick = {
                    // Navigate back to the previous screen
                    navController.popBackStack()
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Go Back")
            }
        }

    }
}