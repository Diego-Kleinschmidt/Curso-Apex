package com.mycompany.exerciciohashm;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ExercicioHashM {

    public static void main(String[] args) {
        HashMap<String, Integer> veiculos = new HashMap<>();

        for (int i = 1; i < 3; i++) {
            String nomeVeiculo = JOptionPane.showInputDialog("Qual o nome do veiculo ?");
            int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Qual a cilindrada?"));
            veiculos.put(nomeVeiculo, cilindrada);
        }
        String formatado = "";
        for (Map.Entry<String, Integer> veiculo : veiculos.entrySet()) {
            String key = veiculo.getKey();
            Integer value = veiculo.getValue();
            formatado += key + " = " + value +  "\n";
        }
        
        JOptionPane.showMessageDialog(null, formatado);
    }
}
