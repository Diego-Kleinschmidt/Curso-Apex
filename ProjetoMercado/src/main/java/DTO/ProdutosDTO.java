package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class ProdutosDTO extends Tabela {
    
    private Campo<Integer> id_produto = new Campo<>("id_produto" , true);
    private Campo<String> descricao_produto = new Campo<>("descricao_produto");
    private Campo<Float> preco = new Campo<>("preco");
    private Campo<Character> situacao = new Campo<>("situacao");
    
    public ProdutosDTO(){
        this.nomeTabela = "produtos";
    }
    
    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampo = new ArrayList<>();
        listaCampo.add(getId_produto());
        listaCampo.add(getDescricao_produto());
        listaCampo.add(getPreco());
        listaCampo.add(getSituacao());
        return listaCampo;
    }

    public Campo<Integer> getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto.valorCampo = id_produto;
    }

    public Campo<String> getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto.valorCampo = descricao_produto;
    }

    public Campo<Float> getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco.valorCampo = preco;
    }

    public Campo<Character> getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao.valorCampo = situacao;
    }

}
