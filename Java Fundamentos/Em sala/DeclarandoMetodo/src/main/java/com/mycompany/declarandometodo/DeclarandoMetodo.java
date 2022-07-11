
package com.mycompany.declarandometodo;


public class DeclarandoMetodo {
    
    public static int somaNumeroEImprime(int numero1,int numero2){
        int soma = numero1 + numero2;
        System.out.println(soma);
        return soma;
    }

    public static void main(String[] args) {
        int retorno = somaNumeroEImprime(12, 2);
        System.out.println(retorno + 2);
    }
}
