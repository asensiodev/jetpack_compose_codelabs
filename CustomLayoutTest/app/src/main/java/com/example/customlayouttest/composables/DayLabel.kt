package com.example.customlayouttest.composables

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import java.time.DayOfWeek
import java.time.format.TextStyle
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DayLabel(dayOfWeek: DayOfWeek) {
    Text(
        text = dayOfWeek.getDisplayName(
            TextStyle.SHORT, Locale.getDefault()
        ),
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .height(24.dp)
            .padding(start = 8.dp, end = 24.dp)
    )
}