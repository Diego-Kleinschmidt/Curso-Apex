
package com.mycompany.exerciciogetset;

import javax.swing.JOptionPane;

public class ExercicioGetSet {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome(JOptionPane.showInputDialog("Qual seu nome ?"));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?")));
        p1.setSexo(JOptionPane.showInputDialog("Qual seu sexo ?"));
        
        JOptionPane.showMessageDialog(null, "Seu nome maiusculo " + p1.getNomeMaiusculo() + " você tem " + p1.getIdade() + " anos e seu genero é " + p1.getSexo());
        JOptionPane.showMessageDialog(null, "Seu nome minusculo " + p1.getNomeMinusculo() + " você tem " + p1.getIdade() + " anos e seu genero é " + p1.getSexo());
    }
}
