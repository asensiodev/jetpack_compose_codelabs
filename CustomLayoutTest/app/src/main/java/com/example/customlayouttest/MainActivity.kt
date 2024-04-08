package com.example.customlayouttest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.customlayouttest.ui.theme.CustomLayoutTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomLayoutTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@Composable
fun HoursHeader(modifier: Modifier = Modifier) {
    val hours = arrayOf(20, 21, 22, 23, 0, 1, 2)
    val brush = Brush.linearGradient(colors = listOf(Color.Blue, Color.Green))

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(5.dp))
            .background(brush)
            .padding(horizontal = 12.dp)
    ) {
        for (item in hours) {
            Text(
                text = item.toString(),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun DayLabel(day: String, modifier: Modifier = Modifier) {
    Text(text = day, fontWeight = FontWeight.Bold, modifier = modifier)
}

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
fun HoursHeaderPreview() {
    HoursHeader()
}

@Preview
@Composable
fun DayLabelPreview() {
    DayLabel(
        "Sun", modifier = Modifier.padding(
            start = 10.dp,
            top = 10.dp,
            end = 15.dp,
            bottom = 10.dp
        )
    )
}

@Preview
@Composable
fun SleepBarPreview() {
    SleepBar()
}
