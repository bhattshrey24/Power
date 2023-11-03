package com.example.power

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.power.ui.theme.PowerTheme

//Todo
// Create details page. Take all the relevant info that is needed in the app.
// Make a logic where we check if name is empty then new user else old user. We are not doing
//   room db check because it is possible that user once added all info and then did not use it that day
// Design OOP structure which suits best logically and for storage.
// Add basic structure of project for MVVM like all the folders etc.

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PowerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android Ji")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", color = Color.White, fontSize = 24.sp,  modifier = Modifier.padding(50.dp
        ,50.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PowerTheme {
        Greeting("Android")
    }
}