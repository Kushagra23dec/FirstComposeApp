package com.kushagra23dec.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kushagra23dec.firstcomposeapp.ui.theme.FirstComposeAppTheme
import com.kushagra23dec.firstcomposeapp.ui.theme.MyFontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text("Hello Kotlin Jetpack", fontSize = 30.sp)
//            Disp1()
//            Disp2("Himawari")
//            Disp3()
//            Disp4()
            SimpleText()
        }
      }
  }

@Composable
fun Disp1(){
    Text("Hello Compose", fontSize = 30.sp)

}

@Composable
fun Disp2(name:String){
    Text("Hello $name", fontSize = 30.sp)

}

@Composable
fun Disp3(){

    Column() {
        Text("Hello Himawari", fontSize = 30.sp)
        Text("Hello sumit", fontSize = 30.sp)
        Text("Hello Kazama", fontSize = 30.sp)
        Text("Hello Kazama", fontSize = 30.sp)
        Text("Hello Nobita", fontSize = 30.sp)
    }

}

@Composable
fun Disp4(){
    val names = listOf<String>("Himawari","Kazama","Krilin","Gohan")
   Column{
       for (name in names){
           Text("Hello $name", fontSize = 30.sp)
       }
   }
}


@Composable
fun SimpleText(){
    Text("Hello Kotlin",
        fontSize = 20.sp,
        color = Color.Red,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily =  MyFontFamily,
        textAlign = TextAlign.Center,
        modifier = Modifier.background(color=Color.Yellow).width(410.dp)
    )
}
