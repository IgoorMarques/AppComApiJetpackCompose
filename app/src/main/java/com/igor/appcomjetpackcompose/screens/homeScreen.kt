package com.igor.appcomjetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
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
    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        for (section in sections) {
            val titulo = section.key
            val produtos = section.value
            item {
                ProdutoSection(nome = titulo, produtos = produtos)
            }
        }
    }

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