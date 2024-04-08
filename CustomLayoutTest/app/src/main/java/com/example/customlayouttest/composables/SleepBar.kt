package com.example.customlayouttest.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SleepBar(modifier: Modifier = Modifier) {
    val brush = Brush.linearGradient(colors = listOf(Color.Blue, Color.Green))

    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(5.dp))
            .background(brush)
            .padding(horizontal = 12.dp)
    ) {
        Spacer(modifier = Modifier.height(18.dp))
    }
}

@Preview
@Composable
fun SleepBarPreview() {
    SleepBar()
}