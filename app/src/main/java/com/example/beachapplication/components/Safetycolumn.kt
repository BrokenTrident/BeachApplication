package com.example.beachapplication.components


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beachapplication.R
import com.example.beachapplication.ui.theme.BeachApplicationTheme


@Composable
fun SafetyColumn(
    modifier: Modifier = Modifier,
) {

    Column(
        modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {


        SafetyCard(
            drawable = R.drawable.hazards,
            text = R.string.lifeguard_tips
        )
        SafetyCard(
            drawable = R.drawable.rip_current,
            text = R.string.rip_currents)
        SafetyCard(
            drawable = R.drawable.wildlife,
            text = R.string.wildlife)



    }
}


@Composable
fun SafetyCard(
    modifier: Modifier = Modifier,
    @DrawableRes drawable: Int ,
    @StringRes text: Int ,

) {


            Surface(

                color = MaterialTheme.colors.surface,
                border = BorderStroke(1.dp, MaterialTheme.colors.secondary),
                elevation = 4.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                Image(
                    painter = painterResource(drawable),
                    contentDescription = "unsplash:dZbBlss3FyE",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(height = 127.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(stringResource(text))
            }



        }
    }


@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun SafetyColumnPreview() {
    BeachApplicationTheme {
        SafetyColumn()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun GeneratedPreview() {
    BeachApplicationTheme {
        SafetyCard(modifier = Modifier,R.drawable.hazards,R.string.lifeguard_tips)
    }
}