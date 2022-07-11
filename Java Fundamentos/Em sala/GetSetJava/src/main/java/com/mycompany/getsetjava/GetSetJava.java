package com.mycompany.getsetjava;

import javax.swing.JOptionPane;

public class GetSetJava {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(JOptionPane.showInputDialog("Qual seu nome?"));
        pessoa1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?")));
        JOptionPane.showMessageDialog(null, pessoa1.getNome() +" você tem "+ pessoa1.getIdade() + " anos");
       
    }
}
