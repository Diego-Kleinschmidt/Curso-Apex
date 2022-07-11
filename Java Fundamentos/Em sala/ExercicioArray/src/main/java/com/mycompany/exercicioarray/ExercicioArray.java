package com.mycompany.exercicioarray;

import javax.swing.JOptionPane;

public class ExercicioArray {

    public static void main(String[] args) {
        String profissoes[] = new String[5];
        for (int i = 0; i < 5; i++) {
            profissoes[i] = JOptionPane.showInputDialog("Qual a " + (i + 1) + "ª profissão");
        }
        JOptionPane.showMessageDialog(null, profissoes);
    }
}
