package br.com.roberta.model;

public class Contato implements Comparable<Contato> { // compara para ordernar a lista
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    // formata a exibição do contato
    public String toString() {
        return String.format("%-20s %-15s %-30s", nome, telefone, email);
    }

    @Override
    // compara os contatos para ordenação
    public int compareTo(Contato outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }
}