package com.mycompany.exercicio03while;

//Escreva todos os números impares entre o número 101 e o número 200.
public class Exercicio03While {

    public static void main(String[] args) {
        int numero = 101;
        while (numero <= 200) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
