package com.mycompany.exerciciooperadorternario;

import javax.swing.JOptionPane;

public class ExercicioOperadorTernario {

    public static void main(String[] args) {
        String nome1 = "", nome2 =  "";
        String mensagem = "";
        int idade1 = 0;
        int idade2 = 0;
        nome1 = JOptionPane.showInputDialog("Qual o nome da primeira pessoa? ");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da primeira pessoa? "));
        nome2 = JOptionPane.showInputDialog("Qual o nome da segunda pessoa? ");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da segunda pessoa? "));

        mensagem = idade1 > idade2 ? nome1 : nome2;
        JOptionPane.showMessageDialog(null, mensagem + " é a pessoa mais velha ");


    }
}
