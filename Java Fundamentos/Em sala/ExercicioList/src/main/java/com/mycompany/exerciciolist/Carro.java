package com.mycompany.exerciciolist;

import java.util.List;
import javax.swing.JOptionPane;

public class Carro {

    public String modelo;
    public int cilindrada;

    public Carro(String modelo, int cilindrada) {
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public static String imprimeFormatado(Iterable<Carro> carros) {
        String listaFormatada = "";
        for (Carro c : carros) {
            listaFormatada += "O veiculo " + c.modelo + " tem motor " + c.cilindrada + "\n";
        }
        return listaFormatada;
    }

    public static void adicionaNaLista(List carros) {
        String modelo;
        do {
            modelo = JOptionPane.showInputDialog("Qual o modelo do carro?\n(0) para sair");
            if (!"0".equals(modelo)) {
                int motor = Integer.parseInt(JOptionPane.showInputDialog("Qual a cilindrada do carro?"));
                carros.add(new Carro(modelo, motor));
            }
        } while ((!"0".equals(modelo)));

    }

}
