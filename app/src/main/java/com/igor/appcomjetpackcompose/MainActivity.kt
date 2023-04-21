package com.igor.appcomjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.igor.appcomjetpackcompose.SampleData.sampleProducts
import com.igor.appcomjetpackcompose.SampleData.sampleSections
import com.igor.appcomjetpackcompose.exercicios.TelaAllProdutos
import com.igor.appcomjetpackcompose.screens.HomeScreen
import com.igor.appcomjetpackcompose.ui.theme.AppComJetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    AppComJetpackComposeTheme {
        Surface {
            HomeScreen(sections = sampleSections)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview() {
    AppComJetpackComposeTheme() {
        Surface() {
            App()
        }
    }

}
