package com.example.beachapplication.views

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.beachapplication.R
import com.example.beachapplication.components.*
import com.example.beachapplication.ui.theme.BeachApplicationTheme
import com.example.beachapplication.viewmodel.DemoViewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: DemoViewModel = viewModel(),

    ) {

    //Remember SystemUiController
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()


    DisposableEffect(systemUiController, useDarkIcons ){

        //Update all of the system bar colors to be transparent, and use
        // dark icons if were in light theme

        systemUiController.setStatusBarColor(
            color = Color.Transparent,
            darkIcons = useDarkIcons
        )

        //setStatusBarColor() and setNavigationBarColor() also exist

        onDispose {  }

    }

    // Index for selecting top pick cards
    var index by rememberSaveable {
        mutableStateOf(0)
    }

    Column(
        modifier

            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Lets Go To the Beach",
                fontSize = 30.sp)

        }
        Spacer(modifier = Modifier.height(10.dp))
        SearchBar()

        HomeSection(title = R.string.beach_row_title) {
            CardRow(
                modifier.padding(start = 10.dp),
                onClick = {
                    index = it
                },


                )
        }
        Spacer(modifier = Modifier.height(10.dp))


        /*if (index == 1) {

            HomeSection(title = R.string.details) {
                BeachCard(
                    drawable = R.drawable.carbay,
                    text = R.string.carbay
                )
            }
        }*/

        when (index) {

            1 -> BeachCard(
                drawable = R.drawable.carbay,
                text = R.string.carbay,
                null,
                R.drawable.ic_baseline_local_parking_24)
            2 -> BeachCard(
                drawable = R.drawable.pebbles,
                text = R.string.pebbles,
                R.drawable.ic_baseline_wifi_24,
                R.drawable.ic_baseline_local_parking_24)
            3 -> BeachCard(
                drawable = R.drawable.needhams_point_beach,
                text = R.string.needhams_point,
                null, R.drawable.ic_baseline_local_parking_24)
            else -> {

            }

        }





        Spacer(modifier = Modifier.height(10.dp))

        HomeSection(title = R.string.safety, modifier.height(1000.dp)) {
            Spacer(modifier = Modifier.height(10.dp))
            SafetyColumn(modifier.padding(start = 10.dp, end = 10.dp))
        }
    }
}

@Composable
fun FullApp() {

    Scaffold(
        modifier = Modifier,
        bottomBar = { BottomNav() },

        ) { padding ->
        HomeScreen(Modifier.padding(padding))
    }

}

//@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
//@Composable
//fun HomeScreenPreview() {
//    BeachApplicationTheme(
//    ) {
//        HomeScreen(modifier = Modifier.background(Color.Cyan))
//    }
//}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FullAppPreview() {
    BeachApplicationTheme {
        FullApp()
    }
}



