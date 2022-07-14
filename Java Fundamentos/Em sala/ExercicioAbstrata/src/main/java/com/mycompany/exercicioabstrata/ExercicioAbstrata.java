package com.mycompany.exercicioabstrata;

public class ExercicioAbstrata {

    public static String som(Animal a) {
        return a.Raca + " faz " + a.emitesom();
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.Raca = "Golden";
        Gato gato1 = new Gato();
        gato1.Raca = "Siames";

        System.out.println(som(cachorro1));
        System.out.println(som(gato1));
    }
}
