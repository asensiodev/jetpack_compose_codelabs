package com.example.customlayouttest.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HoursHeader(hours: List<Int>) {
    val brush = Brush.linearGradient(colors = listOf(Color.Blue, Color.Green))
    Row(
        modifier = Modifier
            .padding(bottom = 16.dp)
            .drawBehind {
                drawRoundRect(
                    brush,
                    cornerRadius = CornerRadius(10.dp.toPx(), 10.dp.toPx())
                )
            }
    ) {
        hours.forEach { hour ->
            Text(
                text = "$hour",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(50.dp)
                    .padding(vertical = 4.dp)
            )
        }
    }
}

@Preview
@Composable
fun HoursHeaderPreview() {
    val hours = listOf(20, 21, 22, 23, 0, 1, 2)
    HoursHeader(hours)
}