package com.example.presentcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentcard.ui.theme.PresentCardTheme
import androidx.compose.ui.text.font.Font


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PresentCard(modifier = Modifier, backgroundColor = Color.fromHex("#073042"))
                }
            }
        }
    }
}
val galanoGrotesqueRegular = FontFamily(Font(R.font.galano_grotesque_regular))

@Composable
fun PresentCard(modifier: Modifier, backgroundColor: Color){

Column(modifier = Modifier
    .fillMaxSize()
    .background(backgroundColor)
    , horizontalAlignment = Alignment.CenterHorizontally
    , verticalArrangement = Arrangement.Center) {


        PresentCardTop(
            name = stringResource(R.string.astor_ludueña),
            title = stringResource(R.string.android_developer),
            backgroundColor = Color.fromHex("#073042")
        )
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 100.dp)
        ) {

        PresentCardInfo(
            phone = stringResource(R.string.phone),
            social = stringResource(R.string.social),
            email = stringResource(R.string.mail),
            modifier = Modifier,
            backgroundColor = Color.fromHex("#073042")
        )


    }

}
}

@Composable
fun PresentCardTop(name: String, title: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(modifier = modifier
        .background(backgroundColor)
        .fillMaxWidth()
        ,horizontalAlignment = Alignment.CenterHorizontally
        ,verticalArrangement = Arrangement.Center) {
        Image(painter = image
             ,contentDescription = "android_logo"
             , modifier = modifier.size(125.dp))
        Text(
            text = name,
            modifier = modifier.padding(10.dp),
            fontSize = 45.sp,
            color = Color.White,
            fontFamily = galanoGrotesqueRegular,
            fontStyle = FontStyle.Normal
            )
        Text(text = title,
            color = Color(0xFF3ddc84),
            fontSize = 23.sp,
            textAlign = TextAlign.Justify,
            fontFamily = galanoGrotesqueRegular)

    }
}
@Composable
fun PresentCardInfo(phone: String, email: String, social: String, modifier: Modifier, backgroundColor: Color) {
    Column(
        modifier = Modifier
            .background(backgroundColor)
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(end = 16.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Phone Icon",
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier
                        .size(24.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier
                        .size(24.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Social Icon",
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier
                        .size(24.dp)
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {

                Text(
                    text = phone,
                    fontSize = 14.sp,
                    modifier = Modifier,
                    color = Color.White,
                    fontFamily = galanoGrotesqueRegular,
                    )
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    text = email,
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = galanoGrotesqueRegular
                )
                Spacer(modifier = Modifier.height(13.dp))
                Text(
                    text = social,
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = galanoGrotesqueRegular
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentCardTheme {
        PresentCard(modifier = Modifier, backgroundColor = Color.fromHex("#073042"))
    }
}
// "#073042"