/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe4;

/**
 *
 * @author 1090482113029
 */
public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido;
    
     public Rio() {
        
    }
    
    // construtor com parâmetro
    public Rio(String nome, double nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void ensolarar(double x){
        if (x <= this.nivel) {
            this.nivel -= x;
            System.out.println("Nível do rio foi dimínuido");
        }
        else {
            System.out.println("O nível não pode ser negativo");
        }
    }
    
    public void chover (double x){
        this.nivel += x;
        System.out.println("Nível do rio foi aumentado");
    }
    
    public void sujar() {
        if (this.poluido){
        System.out.println("Rio já poluído");
        }
        else {
            this.poluido = true;
            System.out.println("Rio foi sujado");
        }
    }
    
    public void limpar() {
       if (!this.poluido){
        System.out.println("Rio já limpo");
        }
        else {
            this.poluido = false;
            System.out.println("Rio foi limpo");
        }
    }
    
    public void mostra(){
        System.out.println("Nome do rio: " + this.nome + " nível do rio " + this.nivel + " poluido? " + this.poluido);
    }
}
