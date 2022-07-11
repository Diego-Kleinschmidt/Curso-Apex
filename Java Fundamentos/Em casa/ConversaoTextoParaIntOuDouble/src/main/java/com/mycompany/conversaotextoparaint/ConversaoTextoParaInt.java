
package com.mycompany.conversaotextoparaint;

import java.util.Scanner;

public class ConversaoTextoParaInt {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = Integer.parseInt(teclado.nextLine());
        int idadeMais20 = idade + 20;
        System.out.println("Sua idade daqui 20 anos sera " + idadeMais20);
        teclado.close();
    }
}
