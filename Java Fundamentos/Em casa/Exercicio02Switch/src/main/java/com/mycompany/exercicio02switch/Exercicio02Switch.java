package com.mycompany.exercicio02switch;
//Escreva um programa que solicite o nome de um dos três países com mais títulos da copa do
//mundo, em seguida escreva uma mensagem ao usuário informando se a resposta está correta
//ou errada. Considere os três países com mais títulos como sendo BRASIL, ITÁLIA E ALEMANHA. 

import javax.swing.JOptionPane;

public class Exercicio02Switch {

    public static void main(String[] args) {
        String pais = JOptionPane.showInputDialog("Informe um dos paises com mais titulos da copa do mundo");
        pais = pais.toUpperCase();
        switch (pais) {
            case "BRASIL" -> JOptionPane.showMessageDialog(null, "Correto");
            case "ITÁLIA" -> JOptionPane.showMessageDialog(null, "Correto");
            case "ALEMANHA" -> JOptionPane.showMessageDialog(null, "Correto");
            default -> JOptionPane.showMessageDialog(null, "Errado");
        }
    }
}
