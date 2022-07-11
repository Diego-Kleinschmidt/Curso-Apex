package com.mycompany.exercicio04ifelse;
//Escreva um programa que solicite a nota de um aluno e em seguida escreva a mensagem
//“Aprovado” caso a nota seja igual ou maior que 6, senão escreva a mensagem “Reprovado”.

import javax.swing.JOptionPane;


public class Exercicio04IfElse {

    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota do aluno ?"));
        if(nota >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
