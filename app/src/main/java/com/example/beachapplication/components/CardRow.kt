package com.example.beachapplication.components



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beachapplication.model.beachData
import com.example.beachapplication.ui.theme.BeachApplicationTheme


@Composable
fun CardRow(
    modifier: Modifier = Modifier,
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(beachData) { item ->
            QuickCard(item.drawable, item.text, Clicked = {})
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun CardPreview() {
    BeachApplicationTheme() {

        CardRow()

    }
}