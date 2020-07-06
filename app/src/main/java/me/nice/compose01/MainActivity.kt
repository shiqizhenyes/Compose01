package me.nice.compose01

import android.app.Application
import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.*
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.TopAppBar
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    MaterialTheme {
        Scaffold(topAppBar = {
            TopAppBar(title = { Text(text = "Compose demo")})
        }, bodyContent = {
            val modifier = Modifier.padding(10.dp)
            MainContent(modifier = modifier)
        })
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview () {
    NewsStory()
}