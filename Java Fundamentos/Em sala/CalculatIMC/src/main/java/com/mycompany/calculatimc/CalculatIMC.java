package com.mycompany.calculatimc;

import javax.swing.JOptionPane;

public class CalculatIMC {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?"));
        Dados pessoa1 = new Dados(nome,altura,peso);
        JOptionPane.showMessageDialog(null, pessoa1.nome + " o seu IMC é " + pessoa1.calculaImc() + "\n" + pessoa1.clasificacaoIMC(pessoa1.calculaImc()));
    }
}
