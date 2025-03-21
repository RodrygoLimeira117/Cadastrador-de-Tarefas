package com.quadro.repositorio;

import com.quadro.modelo.Tarefa;
import java.util.ArrayList;
import java.util.List;

// Aqui guardamos as tarefas em uma lista
public class TarefaRepositorio {
    private final List<Tarefa> listaDeTarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return listaDeTarefas;
    }

    public Tarefa buscarPorId(int id) {
        return listaDeTarefas.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public void atualizarTarefa(Tarefa tarefaAtualizada) {
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            if (listaDeTarefas.get(i).getId() == tarefaAtualizada.getId()) {
                listaDeTarefas.set(i, tarefaAtualizada);
                return;
            }
        }
    }

    public void removerTarefa(int id) {
        listaDeTarefas.removeIf(t -> t.getId() == id);
    }
}