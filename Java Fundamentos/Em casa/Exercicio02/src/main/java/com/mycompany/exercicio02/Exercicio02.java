package com.mycompany.exercicio02;

//Fazer um programa para receber dois números do tipo int do usuário e
//determinar se um número é permutação do outro ou não. Ex: 431 é permutação
//de 143, 42 é permutação de 204, 1211 é permutação de 1112, etc. O programa
//só deve aceitar números positivos. 
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("ola");
        String num1 = JOptionPane.showInputDialog("Digite um numero");
        String num2 = JOptionPane.showInputDialog("Digite outro numero");

        if (permutacao(num1, num2)) {
            JOptionPane.showMessageDialog(null, num1 + " é permutção de " + num2);
        } else {
            JOptionPane.showMessageDialog(null, num1 + " não é permutção de " + num2);
        }
    }

    public static boolean permutacao(String palavra1, String palavra2) {
        boolean ehIgual = true;
        char[] char1 = palavra1.toCharArray();
        for (Character c : char1) {
            if (!palavra2.contains(c.toString())) {
                ehIgual = false;
            }
        }
        return ehIgual;
    }

}
