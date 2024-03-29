package com.projeto.app.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "clientes")
@Entity
public class ClientesModelo {
	
	@Id  //Marca que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Marca que é autoincremento
	@Column(name = "id_cliente")  //Declara o nome da coluna no banco de dados
	private int id_cliente;
	
	@Column(name = "nome_cliente")
	private String nome_cliente;
	
	@Column(name = "idade")
	private int idade;
	
	@Column(name = "situacao")
	private char situacao;

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSituacao() {
		return situacao;
	}

	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}
}
