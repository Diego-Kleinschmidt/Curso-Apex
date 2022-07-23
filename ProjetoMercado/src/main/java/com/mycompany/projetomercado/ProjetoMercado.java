package com.mycompany.projetomercado;

import DAO.ComandosDAO;
import DTO.ClientesDTO;
import javax.swing.JOptionPane;

public class ProjetoMercado {

    public static void main(String[] args) {
        ClientesDTO cli = new ClientesDTO();
        ComandosDAO coamndo = new ComandosDAO();
        cli.setNome_cliente("Diego Henrique Kleinschmidt");
        cli.setIdade(26);
        cli.setSituacao('A');
        // String comando = coamndo.insereRegistro(cli);
       // JOptionPane.showMessageDialog(null, comando);

    }
}
