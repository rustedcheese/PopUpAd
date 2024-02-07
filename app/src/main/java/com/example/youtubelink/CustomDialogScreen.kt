package com.example.youtubelink


import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun CustomDialogScreen(
    sponsorlink: String,
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    onConfirmationRequest: () -> Unit
) {
    val context = LocalContext.current
    val yintent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(sponsorlink))}
    val videoUri = Uri.parse("android.resource://com.example.youtubelink/raw/video")


    Dialog(onDismissRequest = {  }) {
        Card(modifier = modifier
            .height(680.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp)),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF11151C))) {

            IconButton(onClick = { onDismissRequest()})
            {
                Icon(imageVector = Icons.Filled.Close ,
                    contentDescription = "Close",
                    tint = Color(0xFFCC2936))
            }

            Column(modifier = Modifier
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {

//                Text(text = "KIIT Fest Proudly Presents ",
//                    color = Color(0xFFF1F2EB),
//                    modifier = Modifier
//                        .padding(vertical = 48.dp),
//                    fontSize = 20.sp
//                )



//                SponsorImage(sponsorlink = "https://www.burgerking.in/")


//                YouTubePlayer(youtubeVideoId = "xwH4oVnuIAs",
//                    lifecycleOwner = LocalLifecycleOwner.current
//                )

                VideoPlayer(videoUri = videoUri)

//                Text(text = "As its Title Sponsor",
//                    color = Color(0xFFF1F2EB),
//                    modifier = Modifier
//                    .padding(vertical = 48.dp),
//                    fontSize = 20.sp
//                )

//                OpenURLButton("https://www.burgerking.in/")
            }
        }

    }

}

@Composable
fun SponsorImage(sponsorlink: String, modifier: Modifier = Modifier){
    val context = LocalContext.current
    val yintent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(sponsorlink))}
    Image(painter = painterResource(id = R.drawable.sponsor),
        modifier = Modifier
            .padding(12.dp)
            .clip(RoundedCornerShape(20.dp))
            .clickable { context.startActivity((yintent)) },
        contentScale = ContentScale.Fit,
        contentDescription = "Image"
    )
}

//@Composable
//fun CloseButton(onDismissRequest: () -> Unit, ){
//    IconButton(onClick = { onDismissRequest()})
//    {
//        Icon(imageVector = Icons.Filled.Close ,
//            contentDescription = "Close",
//            tint = Color(0xFFCC2936))
//    }
//}