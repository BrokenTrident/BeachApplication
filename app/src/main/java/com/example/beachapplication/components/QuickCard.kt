package com.example.beachapplication.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beachapplication.R
import com.example.beachapplication.ui.theme.BeachApplicationTheme

@Composable
fun QuickCard(
    title:String,
    imageRes: Int,
    modifier: Modifier = Modifier,
    click : () -> Unit

) {




    Surface(

        modifier
            .width(width = 158.dp)
            .height(height = 201.dp)
            .clickable(
                onClick = click

            ),
        shape = RoundedCornerShape(16.dp),
        elevation = 5.dp,
        ) {



            Image(
                painter = painterResource(imageRes),
                contentDescription = "Shape",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(9.dp)))


        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
        )

        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    Color.White,
                    fontSize = 20.sp,
                    FontWeight.Bold,
                    fontFamily = FontFamily.Cursive
                )
            )
        }


    }
}



@Preview(showBackground = false, backgroundColor = 0xFFF0EAE2)
@Composable
fun SurfSafePreview() {
    BeachApplicationTheme {

    }
}