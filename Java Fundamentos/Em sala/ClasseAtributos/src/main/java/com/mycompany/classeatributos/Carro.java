package com.mycompany.classeatributos;

public class Carro {

    public String nome;
    public String motorCilindrada;
    public String peso;

    public String ImprimeCarro() {
        return "O carro " + nome + " tem motor  " + motorCilindrada + " e tem o peso de " + peso;
    }

}
