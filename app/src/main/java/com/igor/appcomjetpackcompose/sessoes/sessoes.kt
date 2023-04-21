package com.igor.appcomjetpackcompose.sessoes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igor.appcomjetpackcompose.SampleData.sampleCandies
import com.igor.appcomjetpackcompose.models.Produto
import com.igor.appcomjetpackcompose.produtos.ProdutoItem

@Composable
fun ProdutoSection(nome: String, produtos: List<Produto>) {
    Column {
        Text(
            text = nome,
            Modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        LazyRow(
            Modifier
                .padding(
                    top = 8.dp,
                )
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(produtos){
                produto ->
                    ProdutoItem(produto = produto)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProdutoSectionPreview() {
    ProdutoSection("Promoçoes", sampleCandies)
}