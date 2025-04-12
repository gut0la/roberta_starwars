package br.com.roberta.leitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            FileReader leitor = new FileReader("exemplo.txt");
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = buffer.readLine();
            }
            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(LerArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
