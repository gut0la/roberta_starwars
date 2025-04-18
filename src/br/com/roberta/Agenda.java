package br.com.roberta;

import br.com.roberta.arquivos.GerenciadorArquivos;
import br.com.roberta.model.Contato;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private static GerenciadorArquivos gerenciador;
    private static List<Contato> contatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            gerenciador = new GerenciadorArquivos("contatos.txt");
            contatos = gerenciador.carregarContatos();
        } catch (IOException e) {
            System.out.println("Erro ao inicializar arquivo: " + e.getMessage());
            return;
        }

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            try {
                switch (opcao) {
                    case 1: inserirContato(); break;
                    case 2: listarContatos(); break;
                    case 3: editarContato(); break;
                    case 4: excluirContato(); break;
                    case 5: buscarPorTrecho(); break;
                    case 6: buscarPorTelefone(); break;
                    case 7: listarArquivos(); break;
                    case 8: mudarArquivo(); break;
                    case 9: exportarBackup(); break;
                    case 10: System.out.println("Saindo... Que a Força esteja com você!"); return;
                    default: System.out.println("Opção inválida!");
                }
                gerenciador.salvarContatos(contatos);
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== Agenda Estrela Divina ===\n");

        System.out.println("             ___");
        System.out.println("           _/___\\_");
        System.out.println("          /       \\");
        System.out.println("         |  () ()  |");
        System.out.println("        /|    ^    |\\");
        System.out.println("       /_|   ===   |_\\" );
        System.out.println("         |_________|");
        System.out.println("      __/ /_|_|_|_\\ \\__");
        System.out.println("     /__/         \\__\\       .-.");
        System.out.println("                            |_:_|\n");

        System.out.println("  * Zooooom *          ___         ___");
        System.out.println("      >===>           [___]-------[___]   <-- TIE Fighters");
        System.out.println("      >>===>          |###|       |###|");
        System.out.println("     >>>===>           UUU         UUU\n");

        System.out.println("                    _______");
        System.out.println("                 .-'       `-.");
        System.out.println("                /             \\");
        System.out.println("               |   O     O    |    <-- Estrela da Morte (técnica de destruição de agendas)");
        System.out.println("               |      ^      |");
        System.out.println("               \\   '---'    /");
        System.out.println("                `-._____.-'");

        System.out.println("\n        R2-D2: 'Beep Boop! Organize seus contatos você deve!'");
        System.out.println("        Yoda:  'Hmm... salvos eles estarão, se backup fizer.'\n");

        System.out.println("1. Inserir Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Editar Contato");
        System.out.println("4. Excluir Contato");
        System.out.println("5. Buscar por Trecho do Nome");
        System.out.println("6. Editar/Excluir por Telefone");
        System.out.println("7. Listar Arquivos de Agenda");
        System.out.println("8. Mudar Arquivo");
        System.out.println("9. Exportar Backup");
        System.out.println("10. Sair");

        System.out.print("Escolha uma opção: ");
    }


    private static void inserirContato() throws IOException {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Verificar duplicatas
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome) || c.getTelefone().equals(telefone)) {
                System.out.println("Contato duplicado! Não pode ter dois Chewbaccas na mesma nave.");
                return;
            }
        }

        contatos.add(new Contato(nome, telefone, email));
        System.out.println("Contato inserido com sucesso!");
    }

    private static void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
            return;
        }

        Collections.sort(contatos); // Ordenar por nome
        System.out.printf("%-20s %-15s %-30s%n", "Nome", "Telefone", "Email");
        System.out.println("------------------------------------------------------------");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }

    private static void editarContato() {
        System.out.print("Digite o nome do contato a editar: ");
        String nome = scanner.nextLine();
        Contato contato = buscarContatoPorNome(nome);

        if (contato == null) {
            System.out.println("Contato não encontrado.");
            return;
        }

        System.out.println("1. Editar Nome\n2. Editar Telefone\n3. Editar Email\n4. Editar Tudo");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Novo nome: ");
                contato.setNome(scanner.nextLine());
                break;
            case 2:
                System.out.print("Novo telefone: ");
                contato.setTelefone(scanner.nextLine());
                break;
            case 3:
                System.out.print("Novo email: ");
                contato.setEmail(scanner.nextLine());
                break;
            case 4:
                System.out.print("Novo nome: ");
                contato.setNome(scanner.nextLine());
                System.out.print("Novo telefone: ");
                contato.setTelefone(scanner.nextLine());
                System.out.print("Novo email: ");
                contato.setEmail(scanner.nextLine());
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.println("Contato editado com sucesso!");
    }

    private static void excluirContato() {
        System.out.print("Digite o nome do contato a excluir: ");
        String nome = scanner.nextLine();
        Contato contato = buscarContatoPorNome(nome);

        if (contato == null) {
            System.out.println("Contato não encontrado.");
            return;
        }

        System.out.print("Confirma exclusão? (S/N): ");
        if (scanner.nextLine().equalsIgnoreCase("S")) {
            contatos.remove(contato);
            System.out.println("Contato excluído com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }

    private static void buscarPorTrecho() {
        System.out.print("Digite um trecho do nome: ");
        String trecho = scanner.nextLine().toLowerCase();
        boolean encontrado = false;

        System.out.printf("%-20s %-15s %-30s%n", "Nome", "Telefone", "Email");
        System.out.println("------------------------------------------------------------");
        for (Contato c : contatos) {
            if (c.getNome().toLowerCase().contains(trecho)) {
                System.out.println(c);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum contato encontrado com esse trecho.");
        }
    }

    private static void buscarPorTelefone() {
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        Contato contato = null;

        for (Contato c : contatos) {
            if (c.getTelefone().equals(telefone)) {
                contato = c;
                break;
            }
        }

        if (contato == null) {
            System.out.println("Contato não encontrado.");
            return;
        }

        System.out.println("Contato encontrado: " + contato);
        System.out.println("1. Editar\n2. Excluir");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.print("Novo nome: ");
            contato.setNome(scanner.nextLine());
            System.out.print("Novo telefone: ");
            contato.setTelefone(scanner.nextLine());
            System.out.print("Novo email: ");
            contato.setEmail(scanner.nextLine());
            System.out.println("Contato editado com sucesso!");
        } else if (opcao == 2) {
            System.out.print("Confirma exclusão? (S/N): ");
            if (scanner.nextLine().equalsIgnoreCase("S")) {
                contatos.remove(contato);
                System.out.println("Contato excluído com sucesso!");
            } else {
                System.out.println("Exclusão cancelada.");
            }
        }
    }

    private static void listarArquivos() {
        List<String> arquivos = gerenciador.listarArquivos();
        if (arquivos.isEmpty()) {
            System.out.println("Nenhum arquivo de agenda encontrado.");
            return;
        }

        System.out.println("Arquivos disponíveis:");
        for (String arquivo : arquivos) {
            System.out.println("- " + arquivo);
        }
    }

    private static void mudarArquivo() throws IOException {
        System.out.print("Digite o nome do novo arquivo: ");
        String novoArquivo = scanner.nextLine();
        gerenciador.mudarArquivo(novoArquivo);
        contatos = gerenciador.carregarContatos();
        System.out.println("Arquivo alterado para: " + novoArquivo);
    }

    private static void exportarBackup() throws IOException {
        gerenciador.exportarBackup();
    }

    private static Contato buscarContatoPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }
}