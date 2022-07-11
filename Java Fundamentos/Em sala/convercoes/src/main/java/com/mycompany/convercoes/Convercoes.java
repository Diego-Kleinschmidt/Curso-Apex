package com.mycompany.convercoes;

import javax.swing.JOptionPane;

public class Convercoes {

    public static void main(String[] args) {
        int idade ;
        idade = Integer.parseInt( JOptionPane.showInputDialog("Qual sua idade? "));
        JOptionPane.showMessageDialog(null,"Sua idade é " + idade);
    }
}
