package com.jwhan.composestudy.day1_hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jwhan.composestudy.day1_hellocompose.ui.theme.Day1_HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Day1_HelloComposeTheme {
                HelloComposeStyled(
                    name = "Android"
                )
            }
        }
    }
}

@Composable
fun HelloComposeStyled(name: String) {
    Row {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(16.dp),
            style = TextStyle(fontSize = 24.sp, color = Color.Red)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HelloComposeStyledPreview() {
    Day1_HelloComposeTheme {
        HelloComposeStyled("Android")
    }
}