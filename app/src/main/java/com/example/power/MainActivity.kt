package com.example.power

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.power.ui.theme.*
import org.intellij.lang.annotations.JdkConstants

//Todo
// Create details page. Take all the relevant info that is needed in the app.
// Make a logic where we check if name is empty then new user else old user. We are not doing
//   room db check because it is possible that user once added all info and then did not use it that day
// Design OOP structure which suits best logically and for storage.
// Add basic structure of project for MVVM like all the folders etc.

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen() // this is for splashscreen

        setContent {
            PowerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}
@Preview()
@Composable
fun Greeting() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
       Text(text = "Wassup!!!", style = TextStyle(color = Color.White, fontSize = 36.sp))
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    PowerTheme {
        Greeting()
    }
}