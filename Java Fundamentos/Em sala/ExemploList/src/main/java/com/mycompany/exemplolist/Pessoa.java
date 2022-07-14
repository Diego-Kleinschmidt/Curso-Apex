
package com.mycompany.exemplolist;

public class Pessoa {
    
     public Pessoa(int idade){
        this.idade = idade;
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    
    public String nome;
    public int idade;
}
