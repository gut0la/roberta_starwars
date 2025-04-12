/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.strings;

/**
 *
 * @author 10253
 */
public class ExemploStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Antes de modificar");
        System.out.println(sb);
        System.out.println("HashCode: "+System.identityHashCode(sb));
        
        //modificando o valor
        sb.append(" e incrivel!");
        System.out.println(sb);
        System.out.println("HashCode:"+System.identityHashCode(sb));
    }
    
}
