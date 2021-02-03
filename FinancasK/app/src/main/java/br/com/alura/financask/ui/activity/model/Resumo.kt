package br.com.alura.financask.ui.activity.model

import java.math.BigDecimal

class Resumo(private val transacoes: List<Transacao>) {

    val receita get() = somaPor(Tipo.RECEITA)

    val despesa get() = somaPor(Tipo.DESPESA)

    val total get() = receita.subtract(despesa)

    private fun somaPor(tipo: Tipo) : BigDecimal{
        val somaDeTransacoesPeloTipo = transacoes
            .filter { it.tipo == tipo }
            .sumByDouble { it.valor.toDouble() }
        return BigDecimal(somaDeTransacoesPeloTipo)
    }
}



// como era antes do filtro
//fun receita() : BigDecimal{
////        var totalReceita = BigDecimal.ZERO
////        for (transacao in transacoes) {
////            if (transacao.tipo == Tipo.RECEITA) {
////                totalReceita = totalReceita.plus(transacao.valor)
////            }
////        }

//fun despesa() : BigDecimal{
////        var totalDespesa = BigDecimal.ZERO
////        for (transacao in transacoes) {
////            if (transacao.tipo == Tipo.DESPESA) {
////                totalDespesa = totalDespesa.plus(transacao.valor)
////            }
////        }