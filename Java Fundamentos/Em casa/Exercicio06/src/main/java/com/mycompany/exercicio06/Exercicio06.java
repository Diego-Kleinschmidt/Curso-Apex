package com.mycompany.exercicio06;

import javax.swing.JOptionPane;

//Faça um programa que receba um nome completo na forma de uma String e
//mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
//menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
//Almeida Prado. Abreviatura: P. J. de A. P
public class Exercicio06 {

    public static void main(String[] args) {
        String nomeCompleto = "Diego Henrique de Kleinschmidt";

        JOptionPane.showMessageDialog(null, abreviaNome(nomeCompleto, ondeTemEspaço(nomeCompleto)));
    }

    public static String abreviaNome(String nome, Integer[] espaco) {
        String abreviacao = "";
        for (int i = 0; i < espaco.length - 1; i++) {
            if (i == 0) {
                abreviacao += nome.charAt(0) + ".";
            }
            abreviacao += nome.charAt(espaco[i] + 1) + ".";
        }

       

        return abreviacao;
    }

    public static Integer[] ondeTemEspaço(String nome) {
        int j = 0;
        Integer[] espacos = new Integer[20];
        for (int i = nome.indexOf(" "); i > 0; i++) {
            i = nome.indexOf(" ", i);
            if (i > 0) {
                espacos[j] = i;
                j++;
            }
        }
        Integer[] espacosValidos = new Integer[j + 1];
        for (int i = 0; i < j; i++) {
            espacosValidos[i] = espacos[i];
        }
        return espacosValidos;
    }

}
