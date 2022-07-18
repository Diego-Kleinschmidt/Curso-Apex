
package com.mycompany.projetomercado;

import DAO.ComandosDAO;
import DTO.ClientesDTO;
import DTO.ProdutosDTO;
import javax.swing.JOptionPane;


public class ProjetoMercado {

    public static void main(String[] args) {
        ComandosDAO DAO = new ComandosDAO();
        ProdutosDTO DTO = new ProdutosDTO();
        DTO.setId_produto(16);
        String comando = DAO.apagaRegistro(DTO);
        JOptionPane.showMessageDialog(null, comando);
         
    }
}
