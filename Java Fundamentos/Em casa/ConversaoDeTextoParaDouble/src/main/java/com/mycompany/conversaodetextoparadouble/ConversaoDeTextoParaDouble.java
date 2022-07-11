package com.mycompany.conversaodetextoparadouble;

import javax.swing.JOptionPane;

public class ConversaoDeTextoParaDouble {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero "));
        double soma = numero1 + numero2;
        String mensagem = String.format("O resultado da soma de %.2f + %.2f é %.2f",numero1, numero2, soma);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
