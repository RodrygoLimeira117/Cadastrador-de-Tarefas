package com.quadro.visao;

import com.quadro.controller.TarefaController;
import com.quadro.modelo.Tarefa;
import java.util.Scanner;

// A parte visível para o usuário - aqui usamos o terminal para interagir
public class Main {
    public static void main(String[] args) {
        TarefaController controller = new TarefaController();
        Scanner scanner = new Scanner(System.in);
        int contadorId = 1;

        while (true) {
            System.out.println("\n=== Quadro de Tarefas ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Ver Tarefas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar entrada

            if (opcao == 1) {
                System.out.print("Título da Tarefa: ");
                String titulo = scanner.nextLine();
                System.out.print("Descrição da Tarefa: ");
                String descricao = scanner.nextLine();
                System.out.print("Status (Ex: Pendente, Em andamento, Concluída): ");
                String status = scanner.nextLine();

                Tarefa novaTarefa = new Tarefa(contadorId++, titulo, descricao, status);
                controller.adicionarTarefa(novaTarefa);

            } else if (opcao == 2) {
                for (Tarefa tarefa : controller.obterTarefas()) {
                    System.out.println("ID: " + tarefa.getId() + 
                        " | Título: " + tarefa.getTitulo() + 
                        " | Status: " + tarefa.getStatus());
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}