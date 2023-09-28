package com.noon.mutabaah.navigation

sealed class Screens(val route: String) {
    object Dashboard : Screens("dashboard")
    object AttendanceHistory : Screens("dashboard/attendanceHistory")
    object Students : Screens("students")
    object Settings : Screens("settings")
}