package com.quadro.servico;

import com.quadro.modelo.Tarefa;
import com.quadro.repositorio.TarefaRepositorio;
import java.util.List;

// Aqui ficam as regras que o programa segue
public class TarefaServico {
    private final TarefaRepositorio repositorio = new TarefaRepositorio();

    public void criarTarefa(Tarefa tarefa) {
        repositorio.adicionarTarefa(tarefa);
    }

    public List<Tarefa> mostrarTarefas() {
        return repositorio.listarTarefas();
    }

    public Tarefa buscarTarefa(int id) {
        return repositorio.buscarPorId(id);
    }

    public void editarTarefa(Tarefa tarefa) {
        repositorio.atualizarTarefa(tarefa);
    }

    public void excluirTarefa(int id) {
        repositorio.removerTarefa(id);
    }
}