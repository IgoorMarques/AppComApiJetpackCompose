package com.igor.appcomjetpackcompose.exercicios

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igor.appcomjetpackcompose.SampleData.sampleProducts
import com.igor.appcomjetpackcompose.models.Produto
import com.igor.appcomjetpackcompose.produtos.ProdutoItem


@Composable
fun TelaAllProdutos(produtos: List<Produto>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) {
            Text(
                text = "Todos os produtos",
                fontSize = 30.sp,
                fontWeight = FontWeight(700),
                fontFamily = FontFamily.Serif
            )
        }
        items(produtos) { produto ->
            ProdutoItem(produto = produto)
        }
    }

}


@Preview
@Composable
fun TelaAllProdutosPreview() {
    TelaAllProdutos(sampleProducts)
}