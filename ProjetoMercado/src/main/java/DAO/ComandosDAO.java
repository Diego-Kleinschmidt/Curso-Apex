package DAO;

import DTO.Tabela;
import UTIL.Campo;
import java.util.ArrayList;

public class ComandosDAO {

    private BancoDAO banco = new BancoDAO();
    
    public String apagaRegistro(Tabela tb) {
        String comando = "DELETE FROM " + tb.nomeTabela + " WHERE ";
        ArrayList<Campo> listaCampo = tb.retornaCampos();
        String comandoWhere = "";
        for (Campo campo : listaCampo) {
            if (campo.chavePrimaria) {
                comandoWhere += campo.nomeCampo + " = " + campo.valorCampo.toString();
            }
        }
        String comandoFinal = comando + comandoWhere;
        banco.executaComando(comandoFinal);
        return comandoFinal;
    }

    public String insereRegistro(Tabela tb) {
        String comando = "INSERT INTO " + tb.nomeTabela;
        ArrayList<Campo> listaCampo = tb.retornaCampos();
        String camposTabela = " (";
        int tamanhoLista = listaCampo.size();
        for (Campo campo : listaCampo) {
            if (!campo.chavePrimaria) {
                camposTabela += campo.nomeCampo;
                if (tamanhoLista != 1) {
                    camposTabela += ", ";
                }
            }
            tamanhoLista--;
        }
        camposTabela += ") ";
        String valoresTabela = " VALUES (";
        tamanhoLista = listaCampo.size();
        for (Campo campo : listaCampo) {
            if (!campo.chavePrimaria) {
                if (campo.valorCampo.getClass() == String.class || campo.valorCampo.getClass() == Character.class) {
                    valoresTabela += "'" + campo.valorCampo + "'";
                } else {
                    valoresTabela += campo.valorCampo;
                }
                if (tamanhoLista != 1) {
                    valoresTabela += ", ";
                }
            }
            tamanhoLista--;
        }
        valoresTabela += ")";
        
        String comandoFinal = comando + camposTabela + valoresTabela;
        banco.executaComando(comandoFinal);
        return comandoFinal;
    }

    public String atualizaRegistro(Tabela tb) {
        String comando = "UPDATE " + tb.nomeTabela + " SET ";
        ArrayList<Campo> listaCampo = tb.retornaCampos();
        String valoresTabela = "";
        int tamanhoLista = listaCampo.size();
        for (Campo campo : listaCampo) {
            if (!campo.chavePrimaria) {
                valoresTabela += campo.nomeCampo + " = ";
                if (campo.valorCampo.getClass() == String.class || campo.valorCampo.getClass() == Character.class) {
                    valoresTabela += "'" + campo.valorCampo + "'";
                } else {
                    valoresTabela += campo.valorCampo;
                }
                if (tamanhoLista != 1) {
                    valoresTabela += " , ";
                }
            }
            tamanhoLista--;
        }
        String comandoWhere = " WHERE ";
        for (Campo campo : listaCampo) {
            if (campo.chavePrimaria) {
                comandoWhere += campo.nomeCampo + " = " + campo.valorCampo.toString();
            }
        }
        String comandoFinal = comando + valoresTabela + comandoWhere;
        banco.executaComando(comandoFinal);
        return comandoFinal;
    }

    public String seleciona(Tabela tb) {
        String comando = "SELECT ";
        ArrayList<Campo> listaCampo = tb.retornaCampos();
        String camposTabela = "";
        int tamanhoLista = listaCampo.size();
        for (Campo campo : listaCampo) {
            camposTabela += campo.nomeCampo;
            if (tamanhoLista != 1) {
                camposTabela += ", ";
            }
            tamanhoLista--;
        }
        camposTabela += " FROM " + tb.nomeTabela;
        
        String comandoFinal = comando + camposTabela;
        banco.executaComando(comandoFinal);
        return comandoFinal;
    }

}
