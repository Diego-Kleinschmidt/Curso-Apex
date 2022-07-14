package com.mycompany.exemplolist;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExemploList {

    public static void main(String[] args) {
        List<Pessoa> listaDeNomes = new ArrayList<Pessoa>();
        Pessoa p1 = new Pessoa("Lucas", 23);
        listaDeNomes.add(p1);
        listaDeNomes.add(new Pessoa("João", 20));
        listaDeNomes.add(new Pessoa("Paulo", 55));
        listaDeNomes.remove(1);
        listaDeNomes.set(0, new Pessoa("gio", 32));
        listaDeNomes.set(0, new Pessoa(90));
        listaDeNomes.set(0, new Pessoa("Mario"));
        listaDeNomes.add(new Pessoa("Marcelo", 44));
        String pessoaFormatada = "Nome    Idade\n";
        for (Pessoa p : listaDeNomes) {
            pessoaFormatada += p.nome + "    " +  p.idade + "\n";
            
        }
        
        
        JOptionPane.showMessageDialog(null,pessoaFormatada);
        
        
    }
}
