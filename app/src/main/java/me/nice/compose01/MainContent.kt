package me.nice.compose01

import android.graphics.drawable.shapes.RoundRectShape
import android.media.Image
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.ClipOp
import androidx.ui.graphics.ImageAsset
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import com.google.android.material.shape.MaterialShapeDrawable


@Composable
fun MainContent(modifier: Modifier = Modifier, image : ImageAsset = imageResource(R.drawable.header)) {

    VerticalScroller(modifier = modifier) {
     val imageModifier = Modifier.clip(RoundedCornerShape(10.dp))
        Image(asset = image, modifier = imageModifier, contentScale = ContentScale.Crop)
        Text("A day wandering through the sandhills in Shark " +
                "Fin Cove, and a few of the sights I saw",
            maxLines = 2, overflow = TextOverflow.Ellipsis,
            style = (MaterialTheme.typography.h1))
        Text("Davenport, california",
            style = (MaterialTheme.typography.body1))
        Text("December 2020",
            style = (MaterialTheme.typography.body2))
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "1")
            Text(text = "2")
            Text(text = "3")
        }
    }

}