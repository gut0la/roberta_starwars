package br.com.roberta.arquivos;

import br.com.roberta.model.Contato;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivos {
    private String arquivoAtual;

    public GerenciadorArquivos(String arquivo) throws IOException {
        this.arquivoAtual = arquivo;
        File file = new File(arquivo);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public void salvarContatos(List<Contato> contatos) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAtual))) {
            for (Contato contato : contatos) {
                writer.write(contato.getNome() + ";" + contato.getTelefone() + ";" + contato.getEmail());
                writer.newLine();
            }
        }
    }

    public List<Contato> carregarContatos() throws IOException {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAtual))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 3) {
                    contatos.add(new Contato(dados[0], dados[1], dados[2]));
                }
            }
        }
        return contatos;
    }

    public void exportarBackup() throws IOException {
        String backup = arquivoAtual.replace(".txt", "_backup.txt");
        Files.copy(Paths.get(arquivoAtual), Paths.get(backup));
        System.out.println("Backup criado: " + backup);
    }

    public void mudarArquivo(String novoArquivo) throws IOException {
        this.arquivoAtual = novoArquivo;
        File file = new File(novoArquivo);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public List<String> listarArquivos() {
        List<String> arquivos = new ArrayList<>();
        File diretorio = new File(".");
        for (File file : diretorio.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                arquivos.add(file.getName());
            }
        }
        return arquivos;
    }
}