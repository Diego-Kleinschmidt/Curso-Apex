
package com.mycompany.exemploarraylist;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        //Cria um array list de nomes
         List<String> nomes = new ArrayList<String>();
         
        //cadastra nomes
        nomes.add("Alice");
        nomes.add("Bianca");
        nomes.add("Caio");
        nomes.add("Denis");
        nomes.add("Ellen");
        
        //Exibe a quantidade de nomes cadastrados 
        System.out.println(nomes.size());
        
        //Altera o nome de Alice para Aline
        nomes.set(0, "Aline");
        
        //Remove o quinto nome do ArrayList (Ellen)
        nomes.remove(4);
        
        //Percorre o arrayList 
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        
        //Exclui todos do dados do ArrayList
        nomes.clear();
        
        System.out.println(nomes.size());
    }
}
