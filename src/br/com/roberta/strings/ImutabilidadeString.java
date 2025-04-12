/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.strings;

/**
 *
 * @author 10253
 */
public class ImutabilidadeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palavra = "Minha palavra";
        System.out.println("Antes de Modificar");
        System.out.println("palavra original: " + palavra);
        System.out.println("HashCode: "+System.identityHashCode(palavra));
        
        //alterando a palavra
        palavra = "patati patata";
        System.out.println("Depois de modificar");
        System.out.println("palavra modificada: " + palavra);
        System.out.println("HashCode: "+System.identityHashCode(palavra));
                
    }
    
}
