package com.mycompany.operadorternario;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {
        String mensagem = "";
        int idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
        mensagem = idade >= 18 ? "maior" : "menor";
        JOptionPane.showMessageDialog(null, "Você é de " + mensagem);
    }
}
