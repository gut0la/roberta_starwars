/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.strings;

/**
 *
 * @author 10253
 */
public class Exemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //equivale
        //String texto = new String("Java é incrível");
        String texto = "Java e incrivel";
        texto = texto + " pra quem gosta";
        System.out.println(texto);
        System.out.println(texto.length());
        System.out.println(texto.toUpperCase());
         System.out.println(texto);
         texto = texto.toUpperCase();
          System.out.println(texto);
          System.out.println(texto.substring(20, 25));
          
        texto = "Novo texto";
        if (texto == "Novo texto"){
            System.out.println("Verdade");
        }
        
         
        
        
        
    }
    
}
