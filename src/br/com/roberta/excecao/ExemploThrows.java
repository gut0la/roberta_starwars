/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.excecao;

import java.util.Scanner;

/**
 *
 * @author 10253
 */
public class ExemploThrows {

   
    /*
    public void metodo() throws NomeDaExcecao {
    }
    */
    
    public static void validarIdade(int idade) throws IllegalArgumentException{
        if (idade<18){
            throw new IllegalArgumentException("Idade Inválida");
        }
        System.out.println("Idade aceitavel");
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int id = leia.nextInt();
        try {
            validarIdade(id);
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro capturado: "+erro.getMessage());
        }finally{
            System.out.println("Sempre cai aqui");
        }
             
    }
    
}
