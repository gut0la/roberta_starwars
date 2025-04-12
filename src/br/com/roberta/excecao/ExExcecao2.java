/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.excecao;

//import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 10253
 */
public class ExExcecao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try {
            System.out.println("Informe um valor pra x: ");
            int x = leia.nextInt();
            int y = 100/x;
            System.out.println("Resultado: "+y);
        } catch (ArithmeticException e) {
            System.out.println("Operação Inválida");
            System.out.println("Erro: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Formato errado");
          //  System.out.println("Erro: "+e.getMessage());
            System.out.println(new Exception("Número esperado"));
        }    
    }
    
}
