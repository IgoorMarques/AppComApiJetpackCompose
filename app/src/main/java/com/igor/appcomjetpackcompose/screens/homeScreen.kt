package com.igor.appcomjetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igor.appcomjetpackcompose.SampleData.sampleSections
import com.igor.appcomjetpackcompose.models.Produto
import com.igor.appcomjetpackcompose.sessoes.ProdutoSection
import com.igor.appcomjetpackcompose.ui.theme.AppComJetpackComposeTheme


@Composable
fun HomeScreen(sections: Map<String, List<Produto>>) {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        for (section in sections) {
            val titulo = section.key
            val produtos = section.value
            ProdutoSection(nome = titulo, produtos = produtos)
        }
    }
    Spacer(Modifier)
}


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    AppComJetpackComposeTheme() {
        Surface() {
            HomeScreen(sections = sampleSections)
        }
    }
}