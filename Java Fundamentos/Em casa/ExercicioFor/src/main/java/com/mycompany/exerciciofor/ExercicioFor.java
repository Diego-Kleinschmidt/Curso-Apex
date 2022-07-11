package com.mycompany.exerciciofor;
//Escreva um programa que mostre na tela o desenho abaixo
// X
// XX
// XXX
// XXXX
// XXXXX

public class ExercicioFor {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}
