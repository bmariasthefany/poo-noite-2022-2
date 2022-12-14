/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1;

/**
 *
 * @author 1090482113029
 */

// algo abstrato e serve de modelo para seus objetos
public class Produto {
    public String nome; // tipo de dado é String (uma classe)
    public int qtde; // tipo de dado é int (tipo primitivo)
    public double preco; // tipo de dado é double (tipo primitivo)
    
    // cria um método construtor
    public Produto() {
        
    }
    
    // cria um método construtor
    public Produto(String nome, int qtde, double preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    // método que compra um produto, aumentando sua qtde
    // método não retorna nada
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }
    
    // método que vende um produto
    public void vender(int x) {
        if (qtde >= x) {
            this.qtde = this.qtde - x;
        }
        else System.out.println("Não há estoque");
       
        
    }
    
}
