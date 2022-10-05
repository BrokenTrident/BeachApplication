package com.example.beachapplication.components



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beachapplication.model.Cards
import com.example.beachapplication.model.cardData
import com.example.beachapplication.ui.theme.BeachApplicationTheme


@Composable
fun CardRow(
    modifier: Modifier = Modifier,
    cardList: List<Cards> = cardData,
    onClick: (Int)->Unit
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(

            cardList,
            key = {
                it.id
            }

        ) { item ->
            QuickCard(item.id,item.title, item.imageRes, click = {
               onClick(item.id)
            })
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun CardPreview() {
    BeachApplicationTheme {


    }
}