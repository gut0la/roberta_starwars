package br.com.roberta.editar;

import br.com.roberta.arquivos.GerenciadorArquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class EditarArquivo {
    public static void main(String[] args) {
        File arquivo = new File("exemplo.txt");
        boolean existe = arquivo.exists() && arquivo.length() > 0;

        try {
            FileWriter escritor = new FileWriter("exemplo.txt", true);
            BufferedWriter buffer = new BufferedWriter(escritor);


            } catch (IOException ex) {
                Logger.getLogger(GerenciadorArquivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
    }
}
