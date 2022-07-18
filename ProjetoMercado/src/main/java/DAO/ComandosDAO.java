package DAO;

import DTO.Tabela;
import UTIL.Campo;
import java.util.ArrayList;

public class ComandosDAO {

    public String apagaRegistro(Tabela tb) {
        String comando = "DELETE FROM " + tb.nomeTabela + " WHERE ";
        String comandoWhere = "";
        ArrayList<Campo> listaCampo = tb.retornaCampos();
        for (Campo campo : listaCampo) {
            if (campo.chavePrimaria){
                comando += campo.nomeCampo + " = " + campo.valorCampo.toString();
            }
        }
        
        return comando + comandoWhere;
    }
}
