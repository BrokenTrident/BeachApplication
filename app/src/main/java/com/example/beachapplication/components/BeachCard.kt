package com.example.beachapplication.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beachapplication.R
import com.example.beachapplication.ui.theme.BeachApplicationTheme


@Composable
fun BeachCard(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    wifi: Int?,
    parking: Int,
    modifier: Modifier = Modifier,
) {


    Surface(
        modifier
            .width(408.dp)
            .height(603.dp)
            .padding(12.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 5.dp,

        ) {

        Column(
            Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = "",
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .width(360.dp)
                    .height(232.dp),
                contentScale = ContentScale.Crop,

                )
            Text(
                stringResource(text),
                modifier = Modifier
                    .align(alignment = Alignment.Start),
                style = MaterialTheme.typography.h4
            )

            Divider()



            Column {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    wifi?.let { painterResource(it) }?.let {
                        Icon(
                            painter = it,
                            contentDescription = "wifi")
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Icon(
                        painter = painterResource(parking),
                        contentDescription = "parking")


                }

                Spacer(modifier = Modifier.height(8.dp))

                Text("Luas dan nyaman. meski belum berani kemana-mana karena kondisi pandemi. " +
                        "hanya menilmati kamar dan sarapan." +
                        " pelayanannya ramah.")
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(

                        backgroundColor = Color.Cyan

                    )
                ) {
                    Text(text = "Learn More")
                }
            }


        }


    }


}




@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun BeachCardPreview() {
    BeachApplicationTheme {
        BeachCard(drawable = R.drawable.pebbles, text = R.string.pebbles,null,R.drawable.ic_baseline_local_parking_24)
    }
}



