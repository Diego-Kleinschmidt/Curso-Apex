package com.mycompany.exercicio02ifelse;

import javax.swing.JOptionPane;

public class Exercicio02IfElse {
    //Escreva um programa que leia um número informado pelo usuário e em seguida escreva uma
    //mensagem indicando se o número é par ou impar. (Considere número par o número cujo resto
    //da divisão por 2 seja igual a Zero) 

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O numero digitado é par");
        }else{
            JOptionPane.showMessageDialog(null, "O numero digitado é impar");
        }
    }
}
