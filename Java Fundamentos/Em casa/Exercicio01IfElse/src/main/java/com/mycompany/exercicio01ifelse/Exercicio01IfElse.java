package com.mycompany.exercicio01ifelse;
//Escreva um programa que solicite um número para o usuário e em seguida escreva uma
//mensagem informando se o número informado é múltiplo de 5. Para que um número seja
//múltiplo de 5, ele deve ser maior ou igual a 5 e o resto da divisão por 5 deve ser igual a zero

import javax.swing.JOptionPane;

public class Exercicio01IfElse {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número "));
        if(numero >= 5 && numero % 5 == 0 ){
            JOptionPane.showMessageDialog(null, numero + " é múltiplo de 5 ");
        }else{
            JOptionPane.showMessageDialog(null, numero + " não é multiplo de 5");
        }
    }
}
