package br.com.roberta.model;

public class Contato implements Comparable<Contato> {
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
    public String toString() {
        return String.format("%-20s %-15s %-30s", nome, telefone, email);
    }

    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }
}