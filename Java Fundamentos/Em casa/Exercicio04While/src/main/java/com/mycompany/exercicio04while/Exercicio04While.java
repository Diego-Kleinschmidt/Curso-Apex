package com.mycompany.exercicio04while;
//Escreva um programa que solicite um número ao usuário e em seguida escreva o valor do
//número informado multiplicado por 5. O programa deve continuar solicitando novos números
//até que o usuário digite um número negativo.

import javax.swing.JOptionPane;

public class Exercicio04While {

    public static void main(String[] args) {
        int numero = 1;
        while (numero >= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número positivo para multiplicar por 5 ou um numero negativo para sair"));
            if (numero >= 0) {
                System.out.println(numero + " multiplicado por 5 é igual a " + (numero * 5));
            }
        }
    }
}
