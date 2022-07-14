package com.mycompany.exerciciolist;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExercicioList {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        Carro.adicionaNaLista(carros);
        JOptionPane.showMessageDialog(null, Carro.imprimeFormatado(carros));
    }
}
