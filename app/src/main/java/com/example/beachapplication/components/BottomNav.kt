package com.example.beachapplication.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beachapplication.ui.theme.BeachApplicationTheme


@Composable
fun BottomNav(modifier: Modifier = Modifier) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primaryVariant,
        modifier = modifier.padding(start = 5.dp, end = 5.dp,bottom = 5.dp).clip(RoundedCornerShape(30.dp))
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null
                )
            },
            label = {
                Text("Home")
            },
            selected = true,
            onClick = {}
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = null
                )
            },
            label = {
                Text("Forward")
            },
            selected = false,
            onClick = {}
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyElementPreview2() {
   BeachApplicationTheme {
        BottomNav()
    }
}