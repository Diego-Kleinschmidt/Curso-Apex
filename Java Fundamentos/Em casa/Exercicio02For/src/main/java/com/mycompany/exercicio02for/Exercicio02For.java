package com.mycompany.exercicio02for;
//Escreva um programa que calcule e escreva o resultado da soma dos números entre 1 e 50.

public class Exercicio02For {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma+=i;
            System.out.println(soma);
            
        }
    }
}
