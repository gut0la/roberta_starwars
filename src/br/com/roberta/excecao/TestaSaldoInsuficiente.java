/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.roberta.excecao;

/**
 *
 * @author 10253
 */
public class TestaSaldoInsuficiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria contaBancaria = new ContaBancaria(500);
        try{
            contaBancaria.sacar(550);
        }catch(SaldoInsuficiente e){
            System.out.println(e.getMessage());
        }
    }
    
}
