package me.nice.compose01

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.vectormath64.cross
import androidx.ui.vectormath64.normal
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
    val image =+ imageResource(R.drawable.header)
    MaterialTheme {
        Column(
            crossAxisSize = LayoutSize.Expand,
            modifier = Spacing(16.dp)
        ) {
            Container(expanded = true, height = 180.dp) {
                Clip(shape = RoundedCornerShape(8.dp)) {
                    DrawImage(image = image)
                }
            }
            Text("A day wandering through the sandhills in Shark " +
                    "Fin Cove, and a few of the sights I saw",
                maxLines = 2, overflow = TextOverflow.Ellipsis,
                style = (+themeTextStyle { h6 }).withOpacity(0.87f))
            Text("Davenport, california",
                style = (+themeTextStyle { body2 }).withOpacity(0.87f))
            Text("December 2019",
                style = (+themeTextStyle { body2 }).withOpacity(0.6f))

//            Row(
//                crossAxisSize = LayoutSize.Expand
//            ) {
//
//                Text(text = "1")
//                Text(text = "2")
//                Text(text = "3")
//
//            }

        }
    }
}

@Preview
@Composable
fun DefaultPreview () {
    NewsStory()
}