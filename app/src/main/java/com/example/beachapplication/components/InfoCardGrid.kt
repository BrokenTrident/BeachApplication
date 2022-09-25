//package com.example.beachapplication.components
//
//
//
//
//import androidx.annotation.DrawableRes
//import androidx.annotation.StringRes
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.beachapplication.model.infoCardData
//import com.example.beachapplication.ui.theme.BeachApplicationTheme
//
//@Composable
//fun InfoCardGrid(
//    modifier: Modifier = Modifier
//) {
//    LazyHorizontalGrid(
//
//        rows = androidx.compose.foundation.lazy.grid.GridCells.Fixed(2),
//        contentPadding = PaddingValues(horizontal = 16.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//        verticalArrangement = Arrangement.spacedBy(10.dp),
//        modifier = modifier
//            .height(120.dp)
//            .padding(top = 10.dp)
//    ) {
//
//        items(infoCardData) { item ->
//            InfoCard(item, item, Modifier.height(56.dp))
//        }
//    }
//}
//
//
//@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
//@Composable
//fun AlignYourBodyElementPreview8() {
//    BeachApplicationTheme {
//        InfoCardGrid()
//    }
//}