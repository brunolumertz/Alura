package br.com.alura.financask.ui.activity.activity

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.ui.activity.ResumoView
import br.com.alura.financask.ui.activity.adapter.ListaTransacoesAdapter
import br.com.alura.financask.ui.activity.delegate.TransacaoDelegate
import br.com.alura.financask.ui.activity.dialog.AdicionaTransacaoDialog
import br.com.alura.financask.ui.activity.model.Tipo
import br.com.alura.financask.ui.activity.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransacoesActivity : AppCompatActivity() {

    private val transacoes: MutableList<Transacao> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        // o var é mutavel, ou seja, usado quando quiser usar mais de um valor para a lista ou adicionar. o val é usado praticamente como uma static, não é alterada
        //o kotlim adiciona sozinho o tipo de lista, a nao ser que vc defina para ele. Exemplo: lista de string -->  var lista: List<String> = listof( "coisa em string")

        configuraResumo()
        configuraLista()
        configuraFab()
    }

    private fun configuraFab() {
        lista_transacoes_adiciona_receita
            .setOnClickListener {
                chamaDialogDeAdicao(Tipo.RECEITA)
            }
        lista_transacoes_adiciona_despesa
            .setOnClickListener {
                chamaDialogDeAdicao(Tipo.DESPESA)
            }
    }

    private fun chamaDialogDeAdicao(tipo: Tipo) {
        AdicionaTransacaoDialog(window.decorView as ViewGroup, this)
            .chama(tipo, object : TransacaoDelegate {
                override fun delegate(transacao: Transacao) {
                    atualizaTransacoes(transacao)
                    lista_transacoes_adiciona_menu.close(true)
                }
            })
    }


    private fun atualizaTransacoes(transacao: Transacao) {
        transacoes.add(transacao)
        configuraLista()
        configuraResumo()
    }

    private fun configuraResumo() {
        val view: View = window.decorView
        val resumoView = ResumoView(this, view, transacoes)
        resumoView.atualiza()
    }


    private fun configuraLista() {
        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))
    }


}