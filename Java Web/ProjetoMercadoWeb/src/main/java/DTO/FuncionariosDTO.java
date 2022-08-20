
package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class FuncionariosDTO extends Tabela {
    
    private Campo<Integer> id_funcionario = new Campo<>("id_funcionario", "Identificador", true);
    private Campo<String> nome_funcionario = new Campo<>("nome_Funcionario", "Nome Funcionario");
    private Campo<Integer> idade = new Campo<>("idade", "Idade");
    private Campo<Character> situacao = new Campo<>("situacao", "Situação");
    
    public FuncionariosDTO(){
        this.nomeTabela = "funcionarios";
    }
    
    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampos = new ArrayList<>();
        listaCampos.add(id_funcionario);
        listaCampos.add(nome_funcionario);
        listaCampos.add(idade);
        listaCampos.add(situacao);
        return listaCampos;
    }

    public Campo<Integer> getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario.valorCampo = id_funcionario;
    }

    public Campo<String> getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario.valorCampo = nome_funcionario;
    }

    public Campo<Integer> getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade.valorCampo = idade;
    }

    public Campo<Character> getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao.valorCampo = situacao;
    }
    
}
