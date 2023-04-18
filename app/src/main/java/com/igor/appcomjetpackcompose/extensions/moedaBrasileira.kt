package com.igor.appcomjetpackcompose.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

fun BigDecimal.moedaBrasileira(): String{
    return NumberFormat.getCurrencyInstance(Locale("pt", "br"))
        .format(this)
}