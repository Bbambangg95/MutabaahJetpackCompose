package com.noon.mutabaah.dashboard.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.twotone.AccountCircle
import androidx.compose.material.icons.twotone.CheckCircle
import androidx.compose.material.icons.twotone.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.noon.mutabaah.navigation.Screens
import com.noon.mutabaah.ui.theme.BlueNoon
import com.noon.mutabaah.ui.theme.MutabaahTheme
import com.noon.mutabaah.ui.theme.OrangeNoon
import com.noon.mutabaah.ui.theme.Purple80

//import com.example.navigationexample.ui.navigation.NavigationScreens

@Composable
fun TodaysOverview(
    navController: NavController
) {
    Column {
        Row {
                Text(text = "Attendance")
            Button(
                onClick = {
                    navController.navigate( Screens.AttendanceHistory.route)
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "View Detail Dashboard")
            }
        }
        Row {
            Column(
                modifier = Modifier
                    .weight(1f),
            ) {
                CardView(
                    number = 27,
                    title = "Students",
                    color = Color(0xFF1E88E5),
                    imageVector = Icons.TwoTone.AccountCircle
                )
                Spacer(modifier = Modifier.height(10.dp))
                CardView(
                    number = 19,
                    title = "Checked In",
                    color = Color(0xFFFFA726),
                    imageVector = Icons.TwoTone.CheckCircle
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                CardView(
                    number = 17,
                    title = "Present",
                    color = Color(0xFF4CAF50),
                    imageVector = Icons.TwoTone.CheckCircle
                )
                Spacer(modifier = Modifier.height(10.dp))
                CardView(
                    number = 2,
                    title = "Absent",
                    color = Color.Red,
                    imageVector = Icons.TwoTone.Warning
                )
            }
        }
        }
    }

