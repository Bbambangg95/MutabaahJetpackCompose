package com.noon.mutabaah.dashboard.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardView(
    number: Int,
    title: String,
    color: Color,
    imageVector: ImageVector
) {
    Row {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
                .padding(end = 10.dp),
            tint = color,
        )
        Column{
            Text(
                text = "$number",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )
            Text(
                text = title,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview
@Composable
fun CardPreview(){
    CardView(number = 20, title = "Test", color = Color.Green, imageVector = Icons.Default.Favorite)
}


