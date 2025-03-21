# Quadro de Tarefas em Java 🗂️

Este projeto consiste em um sistema simples de gerenciamento de tarefas (Task Board), desenvolvido em Java utilizando os princípios da programação orientada a objetos e boas práticas de estruturação em camadas. O objetivo é proporcionar uma base didática e organizada para estudantes em início de graduação que desejam aprender mais sobre desenvolvimento de software com Java.

---

## 🎯 Objetivo

Desenvolver um sistema funcional e bem estruturado que permita o gerenciamento básico de tarefas, aplicando os conceitos de:

- Separação de responsabilidades (camadas: Modelo, Repositório, Serviço, Controlador e Visão)
- Programação orientada a objetos (POO)
- Boas práticas de organização e codificação

---

## ⚙️ Funcionalidades

- ✅ Cadastro de tarefas
- 📋 Listagem de tarefas
- ❌ Encerramento do sistema via menu

Cada tarefa possui os seguintes atributos:
- `ID` (gerado automaticamente)
- `Título`
- `Descrição`
- `Status` (Pendente, Em andamento, Concluída)

---

## 🧱 Estrutura do Projeto
QuadroDeTarefasJava/ ├── src/ │ └── main/ │ └── java/ │ └── com/ │ └── quadro/ │ ├── modelo/ # Representação da entidade Tarefa │ ├── repositorio/ # Simulação da camada de persistência (lista em memória) │ ├── servico/ # Regras de negócio │ ├── controller/ # Camada de controle/intermediação │ └── visao/ # Interface simples via terminal (Main.java) └── README.md
