package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.agenda.model.Aluno;

@SuppressWarnings("unused")
public class AlunoDAO {

    private static final List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
        atualizaIds();
    }

    private void atualizaIds() {
        contadorDeIds++;
    }

    public void edita(Aluno aluno){
        Aluno alunoEncontrado = buscaAlunaPeloId(aluno);
        if(alunoEncontrado != null){
            int posicaoDoAluno = alunos.indexOf(alunoEncontrado);
            alunos.set(posicaoDoAluno, aluno);
        }
    }

    private Aluno buscaAlunaPeloId(Aluno aluno) {
        Aluno alunoEncontrado = null;
        for (Aluno a : alunos){
            if (a.getId() == aluno.getId()){
                return a;
            }
        }
        return null;
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }


    public void remove(Aluno aluno) {
        Aluno alunoDevolvido = buscaAlunaPeloId(aluno);
        if (alunoDevolvido != null){
            alunos.remove(alunoDevolvido);
        }
    }
}
