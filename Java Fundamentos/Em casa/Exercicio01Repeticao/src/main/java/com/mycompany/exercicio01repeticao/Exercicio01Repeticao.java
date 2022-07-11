package com.mycompany.exercicio01repeticao;
//• Sortear um número de 0 a 1000 
//• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//menor do que o número sorteado.
//• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//quantas tentativas ele acertou. 
import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio01Repeticao {

    public static void main(String[] args) {
        int numero = 0;
        Random aleatorio = new Random();
        int sorteado = aleatorio.nextInt(1001);
        int cont = 0;
        String mensagem = "entre 0 e 1000";
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero\n" + mensagem));
            if (numero > sorteado) {
                mensagem = "Seu palpite foi maior que o numero sorteado\nvocê digitou " + numero;
            } else if (numero < sorteado) {
                mensagem = "Seu palpite foi menor que o numero sorteado\nvocê digitou " + numero;
            }
            cont++;
        } while (numero != sorteado);
        JOptionPane.showMessageDialog(null, "Parabéns você acertou\nVocê tentou " + cont + " Vezes");
    }
}
