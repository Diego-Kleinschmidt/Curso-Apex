
package com.mycompany.exercicio02getset;

import javax.swing.JOptionPane;

public class Exercicio02GetSet {

    public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.setNome(JOptionPane.showInputDialog("Qual seu nome ?"));
    p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?")));
    p1.setEmail(JOptionPane.showInputDialog("Qual seu email ?"));
    
    JOptionPane.showMessageDialog(null, p1.getNome() + " você tem " + p1.getIdade() + " anos e seu email é " + p1.getEmail() );
    }
}
