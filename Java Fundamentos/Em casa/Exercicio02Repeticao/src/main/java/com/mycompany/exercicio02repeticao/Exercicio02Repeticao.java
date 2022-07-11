package com.mycompany.exercicio02repeticao;
//Fazer um programa para receber dois números do tipo int do usuário e
//determinar se um número é permutação do outro ou não. Ex: 431 é permutação
//de 143, 1211 é permutação de 1112, etc. O programa
//só deve aceitar números positivos. 
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio02Repeticao {

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite um numero");
        String num2 = JOptionPane.showInputDialog("Digite outro numero");

        if (permutacao(num1, num2)) {
            JOptionPane.showMessageDialog(null, num1 + " é permutção de " + num2);
        } else {
            JOptionPane.showMessageDialog(null, num1 + " não é permutção de " + num2);
        }
    }

    private static boolean ehpermutacao(String a, String b) {
        return a.contentEquals(b);
    }

    private static int[] contaDigitos(int a) {
        int[] v = new int[10];

        while (a > 0) {
            v[a % 10]++;
            a = a / 10;
        }
        return v;
    }
    
    public static boolean permutacao(String palavra1, String palavra2) {
        boolean ehIgual = true;
       char[] char1 =  palavra1.toCharArray();
       for (Character c : char1){
           if (!palavra2.contains(c.toString())){
               ehIgual = false;
           }
       }
       return ehIgual;
    }
}
