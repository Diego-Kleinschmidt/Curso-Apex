package com.mycompany.exercicio03ifelse;
//Escreva um programa que solicite a idade do usuário e em seguida escreva a mensagem ‘Você é
//adulto!’ caso a idade informada seja maior ou igual a 18.

import javax.swing.JOptionPane;


public class Exercicio03IfElse {

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?"));
        if(idade >= 18){
            JOptionPane.showMessageDialog(null, "Você é de Maior");
        }else{
            JOptionPane.showMessageDialog(null, "Você é de menor ");
        }
    }
}
