package com.igor.appcomjetpackcompose.exercicios

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Saudacao(nome:String){
    Text(text = "Olá, $nome!!")
}

@Preview(showBackground = true)
@Composable
fun SaudacaoPreview() {
    Saudacao(nome = "Igor")
}