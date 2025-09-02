package com.jwhan.composestudy.day1_start_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jwhan.composestudy.day1_start_compose.ui.theme.Day1_Start_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Day1_Start_ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Compose",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    var count by remember { mutableIntStateOf(0) }
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = TextStyle(fontSize = 20.sp, color = Color.Magenta),
        )

        Text(
            text = "My name is Ji! Count : $count ",
            modifier = modifier,
            style = TextStyle(fontSize = 15.sp, color = Color.Black),
        )

        Button(onClick = { count++ }, modifier = modifier.fillMaxWidth()) { Text("증가") }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Day1_Start_ComposeTheme {
        Greeting(
            "Compose!!",
            modifier = Modifier.padding()
        )
    }
}