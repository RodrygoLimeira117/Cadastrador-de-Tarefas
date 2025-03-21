package com.quadro.controller;

import com.quadro.modelo.Tarefa;
import com.quadro.servico.TarefaServico;
import java.util.List;

// O controlador conecta o que o usuário faz com o que o sistema faz
public class TarefaController {
    private final TarefaServico servico = new TarefaServico();

    public void adicionarTarefa(Tarefa tarefa) {
        servico.criarTarefa(tarefa);
    }

    public List<Tarefa> obterTarefas() {
        return servico.mostrarTarefas();
    }

    public Tarefa obterTarefaPorId(int id) {
        return servico.buscarTarefa(id);
    }

    public void atualizarTarefa(Tarefa tarefa) {
        servico.editarTarefa(tarefa);
    }

    public void removerTarefa(int id) {
        servico.excluirTarefa(id);
    }
}