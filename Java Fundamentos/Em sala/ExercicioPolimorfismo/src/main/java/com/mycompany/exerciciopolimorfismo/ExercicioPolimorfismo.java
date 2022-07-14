package com.mycompany.exerciciopolimorfismo;

import javax.swing.JOptionPane;

public class ExercicioPolimorfismo {

    public static void mostraTotal(Funcionario fun) {
        JOptionPane.showMessageDialog(null, "O Funcionario " + fun.nome + " Vendeu um total de " + fun.totalDeVendas() + " e sua comição foi " + fun.calculaComissao());
    }

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        Gerente gerente = new Gerente();
        vendedor1.nome = "Mario";
        vendedor2.nome = "João";
        vendedor1.vendasManha = 250.50;
        vendedor1.vendasTarde = 370.95;
        vendedor2.vendasManha = 150.38;
        vendedor2.vendasTarde = 220.68;
        gerente.nome = "Diego";
        gerente.vendedor1 = vendedor1;
        gerente.vendedor2 = vendedor2;

        mostraTotal(gerente);
        mostraTotal(vendedor1);
        mostraTotal(vendedor2);
    }
}
