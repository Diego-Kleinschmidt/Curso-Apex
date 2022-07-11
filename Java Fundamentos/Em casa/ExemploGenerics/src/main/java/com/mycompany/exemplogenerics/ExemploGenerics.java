
package com.mycompany.exemplogenerics;

public class ExemploGenerics {

    public static <E> void exibir (E[] vetores){
        for (E elemento : vetores) {
            System.out.println(elemento);
        }
    }
    
    public static void main(String[] args) {
        //Criando Arrays
        Integer [] idades = {18, 22, 31, 27, 17};
        Double [] alturas = {1.50, 1.77, 1.64, 1.80};
        String [] nomes = {"Vanessa", "Rubens", "Larissa", "Gabriel", "Paloma"};
        
        //Chmando metodos para exibir os dados dos Arrays
        exibir(idades);
        exibir(alturas);
        exibir(nomes);
    }
}
