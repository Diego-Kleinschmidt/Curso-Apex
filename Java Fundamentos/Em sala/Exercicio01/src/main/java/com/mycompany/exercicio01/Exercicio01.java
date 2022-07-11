package com.mycompany.exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome ? ");
        String trabalho = JOptionPane.showInputDialog("Qual seu trabalho ? ");
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e seu trabalho é " + trabalho);
    }
}
