package com.example.thurapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thurapp.ui.theme.ThurAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThurAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        JetpackImage()
                        MyName()
                        HeartEmojy()
                        JetPackCompose()
                    }

                }
            }
        }
    }
}

@Composable
fun JetpackImage(){
    Image(painter = painterResource(id = R.drawable.jetpack_compose_icon),
        contentDescription = null,
    modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
    )
}

@Composable
fun HeartEmojy(){
    Image(painter = painterResource(id = R.drawable.redheart),
        contentDescription = null,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    )
}

@Composable
fun MyName(){
    Text(text = "Nayan Modi",
        color = Color(0xFF4287f5),
    fontSize = 38.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(start = 0.dp, top = 1.dp))
}

@Composable
fun JetPackCompose(){
    Text(text = "Jetpack Compose",
        fontSize = 38.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(start = 0.dp, top = 1.dp))
}

@Preview(showBackground = true,
    widthDp = 390,
    heightDp = 800)
@Composable
fun DefaultPreview() {
    ThurAppTheme {
        JetpackImage()
    }
}