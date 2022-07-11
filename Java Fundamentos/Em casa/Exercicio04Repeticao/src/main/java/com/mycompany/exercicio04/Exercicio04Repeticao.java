package com.mycompany.exercicio04;

//Fazer um programa para medir os reflexos do usuário. O programa deve:
//• Mostrar a palavra “Agora!” após um tempo aleatório e um número,
//também aleatório
//• Contar o tempo até que o usuário digite o número pedido e mostrar esse
//tempo.

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio04Repeticao {

    public static void main(String[] args) throws InterruptedException {
        JOptionPane.showMessageDialog(null, "quando aparecer a mensagem Agora digite o numero entre parentes");
        JOptionPane.showMessageDialog(null, "você demorou " + tempoDeResposta() + " segundos");
    }

    private static long tempoDeResposta() throws InterruptedException {
        Thread.sleep(geradorNumero());
        long inicio = System.currentTimeMillis();
        JOptionPane.showInputDialog("Agora!!!  " + "         (    " + geradorNumero() + "    )   ");
        long fim = System.currentTimeMillis() - inicio;
        return fim / 1000;
    }

    private static int geradorNumero() {
        Random numAleatorio = new Random();
        return numAleatorio.nextInt(5001);
    }

}
