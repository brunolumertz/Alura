package br.com.alura.financask.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.ui.activity.adapter.ListaTransacoesAdapter
import br.com.alura.financask.ui.activity.model.Tipo
import br.com.alura.financask.ui.activity.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        // o var é mutavel, ou seja, usado quando quiser usar mais de um valor para a lista ou adicionar. o val é usado praticamente como uma static, não é alterada
        //o kotlim adiciona sozinho o tipo de lista, a nao ser que vc defina para ele. Exemplo: lista de string -->  var lista: List<String> = listof( "coisa em string")

        val transacoes: List<Transacao> = transacoesDeExemplo()

        configuraLista(transacoes)
    }

    private fun configuraLista(transacoes: List<Transacao>) {
        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))
    }

    private fun transacoesDeExemplo() = listOf(
        Transacao(
            tipo = Tipo.DESPESA,
            data = Calendar.getInstance(),
            valor = BigDecimal(20.5)
        ),
        Transacao(
            valor = BigDecimal(100.0),
            tipo = Tipo.RECEITA,
            categoria = "Economia"
        ),
        Transacao(
            valor = BigDecimal(200.0),
            tipo = Tipo.DESPESA
        ),
        Transacao(
            valor = BigDecimal(500.0),
            categoria = "Prêmio",
            tipo = Tipo.RECEITA
        )
    )
}