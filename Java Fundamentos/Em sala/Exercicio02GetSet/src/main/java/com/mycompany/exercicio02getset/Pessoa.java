package com.mycompany.exercicio02getset;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Primeira letra maiuscula
        String primeiraLetra = nome.substring(0, 1);
        String restoLetras = nome.substring(1, nome.length());
        nome = primeiraLetra.toUpperCase() + restoLetras.toLowerCase();
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email.toLowerCase();
        } else {
            JOptionPane.showMessageDialog(null, "O email que você digitou não é valido");
            setEmail(JOptionPane.showInputDialog("Qual seu email ?"));
        }
    }

}
