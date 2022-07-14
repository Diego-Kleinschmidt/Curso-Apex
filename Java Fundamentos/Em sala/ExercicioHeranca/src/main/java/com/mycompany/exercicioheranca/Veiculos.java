package com.mycompany.exercicioheranca;

public class Veiculos {

    private String nome;
    private String marca;
    private String placa;
    private String chassi;
    private Double peso;
    private int numeroDePasageiros;
    private String cor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getNumeroDePasageiros() {
        return numeroDePasageiros;
    }

    public void setNumeroDePasageiros(int numeroDePasageiros) {
        this.numeroDePasageiros = numeroDePasageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
