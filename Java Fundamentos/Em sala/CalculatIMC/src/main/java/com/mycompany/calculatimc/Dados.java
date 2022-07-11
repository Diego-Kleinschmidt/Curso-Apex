package com.mycompany.calculatimc;

public class Dados {

    public String nome;
    public Double altura;
    public Double peso;

    public Double calculaImc() {
        double IMC = (peso / (altura * altura));
        return Math.round(IMC * 10.0) / 10.0;
    }

    public Dados(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public static String clasificacaoIMC(double a) {
        if (a <= 18.5) {
            return "peso baixo";
        } else if (a > 18.5 && a <= 24.9) {
            return "peso normal";
        } else if (a >= 25.0 && a <= 29.9) {
            return "sobrepeso";
        } else if (a >= 30.0 && a <= 34.9) {
            return "Obesidade grau I";
        } else if (a >= 35 && a <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
