package com.mycompany.classeatributos;

import javax.swing.JOptionPane;

public class ClasseAtributos {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "clio";
        carro1.motorCilindrada = "1,0";
        carro1.peso = "2000kg";
        
        JOptionPane.showMessageDialog(null, carro1.ImprimeCarro());
    }
}
