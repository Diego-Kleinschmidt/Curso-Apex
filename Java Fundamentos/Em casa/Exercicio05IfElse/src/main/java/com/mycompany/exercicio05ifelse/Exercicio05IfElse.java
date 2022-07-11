package com.mycompany.exercicio05ifelse;
//Escreva um programa que solicite as 3 notas de um aluno e em seguida calcule o valor da média
//das notas. Caso a média seja maior ou igual a 9 escreva a mensagem “Conceito A”, caso a nota
//seja menor que 9 e maior ou igual a 7 escreva a mensagem “Conceito B”, caso a nota seja menor
//que 7 e maior ou igual a 5 escreva a mensagem “Conceito C”, se a nota for menor que 5 escreva
//a mensagem “Conceito Insuficiente”.
import javax.swing.JOptionPane;



public class Exercicio05IfElse {

    public static void main(String[] args) {
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Primeira nota "));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Segunda nota "));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Terceira nota "));
        
        float media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 9){
            JOptionPane.showMessageDialog(null, "Conseito A");
        }else if(media < 9 && media >= 7){
            JOptionPane.showMessageDialog(null, "Conseito B");
        }else if(media < 7 && media >=5){
            JOptionPane.showMessageDialog(null, "Conseito C");
        }else{
            JOptionPane.showMessageDialog(null, "Conseito Insuficiente");
        }
    }
}
