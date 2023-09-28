package com.noon.mutabaah

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.noon.mutabaah.dashboard.presentation.DashboardScreen
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.noon.mutabaah.attendance.presentation.AttendanceScreen
import com.noon.mutabaah.dashboard.presentation.AttendanceHistoryScreen
import com.noon.mutabaah.navigation.Screens
import com.noon.mutabaah.student.presentation.StudentScreen
import com.noon.mutabaah.user.presentation.SettingScreen


data class NavigationBarItem(
    val label: String,
    val icon: Int,
    val route: String
)

val navigationBarItems = listOf(
    NavigationBarItem("Dashboard", R.drawable.dashboard_fill, Screens.Dashboard.route),
    NavigationBarItem("Student", R.drawable.group_person, Screens.Students.route),
    NavigationBarItem("Memorize", R.drawable.gear_setting, Screens.Settings.route),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var navigationSelectedItem by remember { mutableStateOf(0) }
    val navController = rememberNavController()
    
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navigationBarItems.forEachIndexed { index, navigationItem ->
                    NavigationBarItem(
                        selected = index == navigationSelectedItem,
                        label = { Text(navigationItem.label) },
                        icon = {
                            Image(
                                painter = painterResource(id = navigationItem.icon),
                                contentDescription = navigationItem.label
                            )
                               },
                        onClick = {
                            navigationSelectedItem = index
                            navController.navigate(navigationItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.Dashboard.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Dashboard.route) { DashboardScreen(navController) }
            composable(Screens.AttendanceHistory.route) { AttendanceHistoryScreen(navController) }
            composable(Screens.Students.route) { StudentScreen(navController) }
            composable(Screens.Settings.route) { SettingScreen(navController) }
        }
        BackHandler {

        }
    }
}
