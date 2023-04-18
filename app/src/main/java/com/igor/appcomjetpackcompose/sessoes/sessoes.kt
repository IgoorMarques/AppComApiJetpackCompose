package com.igor.appcomjetpackcompose.sessoes

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.igor.appcomjetpackcompose.R
import com.igor.appcomjetpackcompose.SampleData.sampleCandies
import com.igor.appcomjetpackcompose.models.Produto
import com.igor.appcomjetpackcompose.produtos.ProdutoItem
import java.math.BigDecimal

@Composable
fun ProdutoSection(nome: String, produtos: List<Produto>) {
    Column {
        Text(
            text = nome,
            Modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(
                    top = 8.dp,
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            for (produto in produtos){
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