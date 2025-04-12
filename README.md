# 📒 Agenda da Millennium Falcon

Bem-vindo(a) à **Agenda da Millennium Falcon**, um projeto desenvolvido em Java para gerenciar contatos e ajudar a consertar a nave mais icônica da galáxia! Este projeto foi criado como parte de uma missão Jedi para aprofundar conhecimentos em manipulação de arquivos, controle de fluxo e lógica de programação, com um toque de gamificação inspirado em *Star Wars*.

---

## ✨ Descrição do Projeto

A Agenda da Millennium Falcon é um sistema de gerenciamento de contatos que permite:

- ✅ Criar, listar, editar e excluir contatos (nome, telefone, email).
- 📁 Manipular múltiplos arquivos de agenda.
- 🔎 Implementar funcionalidades como busca interativa, proteção contra duplicatas e backup.
- 💻 Garantir uma interface interativa e organizada, com exibição profissional dos contatos.

> Cada funcionalidade representa um reparo na nave, culminando em uma missão bem-sucedida para a Rebelião!

---

## 📁 Estrutura do Projeto

aulas_AnaliseProjeto/
├── .idea/                          # Configurações do IntelliJ
├── build/                          # Diretório gerado pelo Maven
├── nbproject/                      # Configurações do NetBeans (se aplicável)
├── out/                            # Diretório de saída (compilação)
├── src/                            # Código-fonte principal
│   ├── main/                       # Código principal
│   │   ├── java/                   # Código Java
│   │   │   └── br/                 # Pacote base
│   │   │       └── com/            # Pacote base
│   │   │           └── roberta/    # Pacote principal
│   │   │               ├── AgendaMillenniumFalcon.java  # Classe principal
│   │   │               ├── arquivos/                    # Pacote para manipulação de arquivos
│   │   │               │   └── GerenciadorArquivos.java # Classe de gerenciamento de arquivos
│   │   │               ├── editor/                      # Pacote para edição (não usado diretamente)
│   │   │               ├── excecao/                     # Pacote para exceções
│   │   │               ├── expressaoregular/            # Pacote para expressões regulares
│   │   │               ├── heranca/                     # Pacote para herança
│   │   │               ├── leitor/                      # Pacote para leitura
│   │   │               ├── logging/                     # Pacote para logging
│   │   │               ├── model/                       # Pacote para modelos
│   │   │               │   └── Contato.java             # Classe de modelo Contato
│   │   │               └── strings/                     # Pacote para manipulação de strings
│   │   └── resources/              # Recursos (vazio)
│   └── test/                       # Testes (vazio)
├── aulas_AnaliseProjeto.iml        # Arquivo de módulo do IntelliJ
├── build.xml                       # Arquivo de build do Ant (se aplicável)
├── contatos.txt                    # Arquivo de contatos gerado
├── exemplo.txt                     # Arquivo de exemplo
├── manifest.mf                     # Manifesto (gerado pelo Maven)


## Pré-requisitos

Para executar este projeto, você precisará de:
- **Java 8 ou superior**: O projeto foi desenvolvido usando Java padrão.
- **Maven**: Para gerenciar dependências e compilar o projeto.
- **IDE (opcional)**: IntelliJ IDEA ou outra IDE de sua preferência para facilitar o desenvolvimento.
- **Git**: Para clonar e gerenciar o repositório.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd aulas_AnaliseProjeto
