
package br.com.roberta.excecao;

import java.util.Scanner;


public class ExExcecaoThrow {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade = leia.nextInt();
        
        if (idade < 18){ 
           // System.out.println("Idade menor que 18");
           throw new IllegalArgumentException("Idade mínima é 18 anos");
        }
        System.out.println("Idade permitida");
        
    }
    
}
