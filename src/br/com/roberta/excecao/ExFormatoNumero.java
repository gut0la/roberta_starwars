/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.excecao;

import javax.swing.JOptionPane;

/**
 *
 * @author 10253
 */
public class ExFormatoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String var = JOptionPane.showInputDialog("Digite um número inteiro");
        try {
            int i = Integer.parseInt(var);
            JOptionPane.showMessageDialog(null, "O número digitado foi: "+i);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, 
                    "Não é possível atribuir um número inteiro");
            System.out.println("Erro "+nfe.getMessage());
        }
    }
    
}
