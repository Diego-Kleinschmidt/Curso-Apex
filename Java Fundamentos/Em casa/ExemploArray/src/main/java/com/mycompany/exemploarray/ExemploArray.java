package com.mycompany.exemploarray;

import javax.swing.JOptionPane;

public class ExemploArray {

    public static void main(String[] args) {
        String[] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Informe o nome do aluno " + (i + 1));
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
