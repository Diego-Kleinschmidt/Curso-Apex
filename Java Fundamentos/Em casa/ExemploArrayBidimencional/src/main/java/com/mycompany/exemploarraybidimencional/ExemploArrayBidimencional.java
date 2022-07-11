package com.mycompany.exemploarraybidimencional;

import javax.swing.JOptionPane;

public class ExemploArrayBidimencional {

    public static void main(String[] args) {
        int quantAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos tem na turma ?"));
        int quantProvas;
        do {
            quantProvas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas tiveram no semestre \nNumero maximo de provas 5"));
            String[][] nomesENotas = new String[quantAlunos][quantProvas +1];
            int[] somaNotas = new int[quantAlunos];
            
            if (quantProvas <= 5) {
                for (int i = 0; i < nomesENotas.length; i++) {
                    for (int j = 0; j < nomesENotas[i].length; j++) {
                        switch (j) {
                            case 0:
                                nomesENotas[i][j] = JOptionPane.showInputDialog("Qual o nome do aluno " + (i + 1));
                                break;
                            case 1:
                                nomesENotas[i][j] = JOptionPane.showInputDialog("Qual a " + j + "ª nota do aluno " + nomesENotas[i][0]);
                                somaNotas[i] += Integer.parseInt(nomesENotas[i][j]);
                                break;
                            case 2:
                                nomesENotas[i][j] = JOptionPane.showInputDialog("Qual a " + j + "ª nota do aluno " + nomesENotas[i][0]);
                                somaNotas[i] += Integer.parseInt(nomesENotas[i][j]);
                                break;
                            case 3:
                                nomesENotas[i][j] = JOptionPane.showInputDialog("Qual a " + j + "ª nota do aluno " + nomesENotas[i][0]);
                                somaNotas[i] += Integer.parseInt(nomesENotas[i][j]);
                                break;
                            case 4:
                                nomesENotas[i][j] = JOptionPane.showInputDialog("Qual a " + j + "ª nota do aluno " + nomesENotas[i][0]);
                                somaNotas[i] += Integer.parseInt(nomesENotas[i][j]);
                                break;
                            default:
                                nomesENotas[i][j] = JOptionPane.showInputDialog("Qual a " + j + "ª nota do aluno " + nomesENotas[i][0]);
                                somaNotas[i] += Integer.parseInt(nomesENotas[i][j]);
                                break;
                        }
                    }
                }
                
                String nomesEMedias = "";
                for (int i = 0; i < nomesENotas.length; i++) {
                    nomesEMedias += "O aluno " + nomesENotas[i][0];
                    nomesEMedias += " tem média " + Integer.toString(somaNotas[i] / quantProvas);
                    nomesEMedias += "\n";
                }
                
                JOptionPane.showMessageDialog(null, nomesEMedias);

            } else {
                JOptionPane.showMessageDialog(null, "A quantidade maxima de provas é 5 ");
            }
        } while (quantProvas > 5);
    }
}
