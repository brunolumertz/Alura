package br.com.alura.financask.ui.activity.model

import java.math.BigDecimal
import java.util.*

class Transacao(
    val valor: BigDecimal,
    val categoria: String = "Indefinida",
    val tipo: Tipo,
    val data: Calendar = Calendar.getInstance())


