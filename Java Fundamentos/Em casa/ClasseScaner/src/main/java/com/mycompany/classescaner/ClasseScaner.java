package com.mycompany.classescaner;

import java.util.Scanner;

public class ClasseScaner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("O nome digitado foi " + nome);
        teclado.close();
    }
}
