package com.mycompany.exerciciofor;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ExercicioFor {

    public static void main(String[] args) {
        int idades[] = new int[5];
        int indiceMaior = 0;
        int IndiceMenor = 0;
        for (int i = 0; i < 5; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da " + (i + 1) + "ª pessoa ?"));
            idades[i] = idade;
            if (idades[i] > idades[indiceMaior]) {
                indiceMaior = i;
            }
            if (idades[i] < idades[IndiceMenor]) {
                IndiceMenor = i;
            }

        }
        JOptionPane.showMessageDialog(null, "A menor idade é " + idades[IndiceMenor] + " e a  maior idade é " + idades[indiceMaior] + "\n dentre as idades " + Arrays.toString(idades));
    }
}
