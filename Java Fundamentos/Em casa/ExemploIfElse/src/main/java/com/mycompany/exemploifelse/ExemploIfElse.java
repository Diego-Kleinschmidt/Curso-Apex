package com.mycompany.exemploifelse;

import java.util.Random;
import javax.swing.JOptionPane;

public class ExemploIfElse {

    public static void main(String[] args) {
        int secreto = new Random().nextInt(50);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de entre 0 e 50 \nBoa Sorte"));
        if (numero == secreto) {
            JOptionPane.showMessageDialog(null, "Parabéns você acertou !!! \nO número secreto era" + secreto);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena você errou o número secreto era " + secreto);
        }
    }
}
