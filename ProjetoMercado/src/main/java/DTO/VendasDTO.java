package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class VendasDTO extends Tabela {

    private Campo<Integer> id_venda = new Campo<>("id_venda","Identificador", true);
    private Campo<Integer> fk_cliente = new Campo<>("fk_cliente","Cliente");
    private Campo<Integer> fk_produto = new Campo<>("fk_produto","Produto Comprado");
    private Campo<Integer> fk_funcionario = new Campo<>("fk_funcionario","Funcionario");
    private Campo<Integer> quantidade = new Campo<>("quantidade","Quantidade");

    public VendasDTO() {
        this.nomeTabela = "vendas";
    }

    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampo = new ArrayList<>();
        listaCampo.add(getId_venda());
        listaCampo.add(getFk_cliente());
        listaCampo.add(getFk_produto());
        listaCampo.add(getFk_funcionario());
        listaCampo.add(getQuantidade());
        return listaCampo;
    }

    public Campo<Integer> getId_venda() {
        return id_venda;
    }

    public void setId_venda(Integer id_venda) {
        this.id_venda.valorCampo = id_venda;
    }

    public Campo<Integer> getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(Integer fk_cliente) {
        this.fk_cliente.valorCampo = fk_cliente;
    }

    public Campo<Integer> getFk_produto() {
        return fk_produto;
    }

    public void setFk_produto(Integer fk_produto) {
        this.fk_produto.valorCampo = fk_produto;
    }

    public Campo<Integer> getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(Integer fk_funcionario) {
        this.fk_funcionario.valorCampo = fk_funcionario;
    }

    public Campo<Integer> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade.valorCampo = quantidade;
    }

    
}
