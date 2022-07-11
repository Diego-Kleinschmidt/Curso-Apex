package com.mycompany.arraybidimensional;

import javax.swing.JOptionPane;

public class ArrayBidimensional {

    public static void main(String[] args) {
        String[][] lista = new String[2][2];
        String telefone = "";
        String nome = "";
        for (int linha = 0; linha < lista.length; linha++) {
            for (int coluna = 0; coluna < lista[linha].length; coluna++) {
                if (coluna == 0) {
                    nome = JOptionPane.showInputDialog("Qual seu nome ? ");
                    lista[linha][coluna] = nome;
                } else {
                    telefone = JOptionPane.showInputDialog("Qual seu telefone ?");
                    lista[linha][coluna] = telefone;
                }
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
