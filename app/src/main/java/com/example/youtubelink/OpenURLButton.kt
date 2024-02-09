package com.example.youtubelink

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun OpenURLButton(
    yt: String,
    isEnabled: Boolean,
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFFCC2936),
        disabledContainerColor = Color(0xFFCC2936).copy(alpha = .3f)
    ),
    textToShow: String = "Visit Us"
) {
    val context = LocalContext.current
    val yintent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(yt)) }


    Button(
        onClick = { context.startActivity((yintent)) },
        modifier = Modifier
            .width(280.dp)
            .height(48.dp),
        enabled = isEnabled,
        shape = shape,
        colors = colors
    ) {
        Text(text = textToShow, modifier = Modifier, color = Color(0xFFF1F2EB))
    }
}
