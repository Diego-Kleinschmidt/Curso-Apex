
package com.mycompany.exemploternario;

import javax.swing.JOptionPane;

public class ExemploTernario {

    public static void main(String[] args) {
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?"));
      String mensagem = idade >= 18 ? "Maior" : "Menor";
      JOptionPane.showMessageDialog(null, "Você é " + mensagem + " de idade");
        
    }
}
