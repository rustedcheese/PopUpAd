package com.example.youtubelink

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp



@Composable
fun OpenURLButton() {
    val ytb = "https://www.burgerking.in/"
    val context = LocalContext.current
    val yintent = remember {Intent(Intent.ACTION_VIEW, Uri.parse(ytb))}


    Button(onClick = {context.startActivity((yintent))}, modifier = Modifier.width(256.dp).height(48.dp),shape = RoundedCornerShape(8.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCC2936))) {
        Text(text = "Visit Us", modifier = Modifier, color = Color(0xFFF1F2EB))    }
}