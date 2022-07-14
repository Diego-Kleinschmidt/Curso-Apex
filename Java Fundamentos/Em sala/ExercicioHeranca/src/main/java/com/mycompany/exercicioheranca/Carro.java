
package com.mycompany.exercicioheranca;

public class Carro extends Veiculos{
    private int numDePortas;
    private double volumePortaMalas;

    public int getNumDePortas() {
        return numDePortas;
    }
    public void setNumDePortas(int numDePortas) {
        this.numDePortas = numDePortas;
    }

    public double getVolumePortaMalas() {
        return volumePortaMalas;
    }

    public void setVolumePortaMalas(double volumePortaMalas) {
        this.volumePortaMalas = volumePortaMalas;
    }
}
