/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.roberta.excecao;

/**
 *
 * @author 10253
 */
public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor) throws SaldoInsuficiente{
        if (valor > saldo){
            throw new SaldoInsuficiente("Erro: Saldo Insuficiente!");
        }
        saldo = saldo - valor;
        System.out.println("Saque realizado com sucesso");
    }
    
}
