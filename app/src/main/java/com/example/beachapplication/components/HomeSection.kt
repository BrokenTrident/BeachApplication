package com.example.beachapplication.components


import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beachapplication.R
import com.example.beachapplication.ui.theme.BeachApplicationTheme
import java.util.*


@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(modifier) {
        Text(
            stringResource(title)
                .uppercase(Locale.getDefault()),
            fontSize = 25.sp,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)

        )
        Divider()
        content()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSectionPreview() {
    BeachApplicationTheme(
    ) {
        HomeSection(title = R.string.pebbles) {


        }
    }
}

