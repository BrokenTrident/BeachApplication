package com.example.beachapplication.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beachapplication.R
import com.example.beachapplication.components.*
import com.example.beachapplication.model.Cards
import com.example.beachapplication.ui.theme.BeachApplicationTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

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
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Lets Go To the Beach",
                fontSize = 30.sp)
            Icon(Icons.Default.Menu, contentDescription = null)
        }
        Spacer(modifier = Modifier.height(10.dp))
        SearchBar()

        HomeSection(title = R.string.beach_row_title) {
            CardRow(
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
        
        when(index){
            
            1-> BeachCard(drawable = R.drawable.carbay, text =R.string.carbay )
            2-> BeachCard(drawable = R.drawable.pebbles, text =R.string.pebbles )
            3-> BeachCard(drawable = R.drawable.barbados_rockley_beach, text = R.string.needhams_point )
            else ->{
                Text(text = "Index no $index")
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



