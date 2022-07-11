package com.mycompany.exercicio01switch;

import javax.swing.JOptionPane;
//Escreva um programa que apresente uma lista com as opções ‘1 - Sacar’, ‘2 - Depositar’, ‘3 -
//verificar saldo’. Em seguida solicite que o usuário informe um número entre 1 e 3. Caso o
//usuário tenha informado o número 1 apresente a mensagem “você escolheu a opção sacar”,
//caso o usuário tenha informado o número 2 apresente a mensagem “você escolheu a opção
//depositar”, caso o usuário tenha informado o número 3, apresente a mensagem ‘você escolheu
//a opção verificar saldo’. Caso o usuário tenha informado um número fora do range(1,2,3)
//apresente a mensagem ‘Opção inválida’.

public class Exercicio01Switch {

    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre 1 e 3"));
        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "você escolheu a opção sacar");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "você escolheu a opção depositar");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "você escolheu a opção verificar saldo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");
                break;
        }
    }
}
