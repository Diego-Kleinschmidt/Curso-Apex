package com.mycompany.exercicio02while;
//Escreva um programa que solicite dois números distintos para o usuário, e em seguida, escreva
//todos os número entre o intervalo dos números informados. 

import javax.swing.JOptionPane;

public class Exercicio02While {

    public static void main(String[] args) {
        int numeroIni = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int numeroFim = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior que " + numeroIni));
        if (numeroIni < numeroFim) {
            while (numeroIni <= numeroFim) {
                System.out.println(numeroIni);
                numeroIni++;
            }
        }else{
            JOptionPane.showMessageDialog(null, "segundo numero menor que o primeiro tente de novo");
        }
    }
}
