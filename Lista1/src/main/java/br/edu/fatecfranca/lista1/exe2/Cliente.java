/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe2;

/**
 *
 * @author 1090482113029
 */
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    // construtor sem parâmetro
    public Cliente() {
        
    }
    
    // construtor com parâmetro
    public Cliente(int nroConta, int nroAgencia, String nome, double saldo) {
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void depositar(double x){
        this.saldo += x;
    }
    
    public void sacar(double x){
        if(this.saldo >= x){
            this.saldo -= x;
        }
        else {
            System.out.println("Saldo insuficientel");
        }
    }
    
    public String paraString(){
        return " Nro Agência " + this.nroAgencia +
                " Nro Conta " + this.nroConta +
                " Nome " + this.nome +
                " Saldo " + this.saldo;
    }
}
