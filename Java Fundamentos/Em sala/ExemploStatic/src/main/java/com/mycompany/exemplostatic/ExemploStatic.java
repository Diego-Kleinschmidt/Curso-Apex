package com.mycompany.exemplostatic;

import javax.swing.JOptionPane;

public class ExemploStatic {
    
    public static void mostraMensagem(){
        String mensagem = JOptionPane.showInputDialog("insira a mensagem");
        System.out.println(UtilitarioNumerico.retornaMinusculo(mensagem));
    }

    public static void main(String[] args) {
        UtilitarioNumerico.numero1 = 20;
        UtilitarioNumerico.numero2 = 20;
        int soma = UtilitarioNumerico.somaNumeros();
        mostraMensagem();
        System.out.println(soma);
        
    }
}
