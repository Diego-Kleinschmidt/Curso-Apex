package DAO;

import DTO.ClientesDTO;
import DTO.FuncionariosDTO;
import DTO.ProdutosDTO;
import DTO.Tabela;
import DTO.VendasDTO;
import UTIL.CRUDUtil;
import UTIL.Campo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

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

    public TableModel retornaRegistroCRUD(Tabela tb, String where) {
        ArrayList<Campo> listaCampo = tb.retornaCampos();
        String campos = "";
        int tamanhoLista = listaCampo.size();
        for (Campo campo : listaCampo) {
            campos += campo.nomeCampo + " '" + campo.apelidoCampo + "' ";
            if (tamanhoLista != 1) {
                campos += ",";
            }

            tamanhoLista--;
        }
        return CRUDUtil.resultSetToTableModel(banco.retornaDados("SELECT " + campos + " FROM " + tb.nomeTabela + " " + where));
    }

    public TableModel retornaRegistroCRUDVenda(ClientesDTO cli, FuncionariosDTO fun, ProdutosDTO pro, VendasDTO ven) {
        String campos = "";
        campos += ven.getId_venda().nomeCampo + " '" + ven.getId_venda().apelidoCampo + "' " + ", ";
        campos += cli.getNome_cliente().nomeCampo +  " '" + cli.getNome_cliente().apelidoCampo + "' " + ", ";
        campos += pro.getDescricao_produto().nomeCampo + " '" + pro.getDescricao_produto().apelidoCampo + "' " + ", ";
        campos += fun.getNome_funcionario().nomeCampo + " '" + fun.getNome_funcionario().apelidoCampo + "' " + ", ";
        campos += ven.getQuantidade().nomeCampo + " '" + ven.getQuantidade().apelidoCampo + "' " ;
       
        String inner = " INNER JOIN " + cli.nomeTabela + " ON vendas.fk_cliente = clientes.id_cliente ";
        inner += " INNER JOIN " + pro.nomeTabela + " ON vendas.fk_produto = produtos.id_produto ";
        inner += " INNER JOIN " + fun.nomeTabela + " ON vendas.fk_funcionario = funcionarios.id_funcionario ";
        String cf = "SELECT " + campos + " FROM " + ven.nomeTabela + inner;
        return CRUDUtil.resultSetToTableModel(banco.retornaDados(cf));
    }
}
