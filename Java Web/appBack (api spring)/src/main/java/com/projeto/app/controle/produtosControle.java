package com.projeto.app.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projeto.app.modelo.ProdutosModelo;
import com.projeto.app.repositorio.ProdutosRepositorio;

@RestController
public class produtosControle {
	
	@Autowired
	ProdutosRepositorio rep;
	
	@GetMapping(path = "api/produtos")
	public List<ProdutosModelo> buscar(){
		return rep.findAll();
	}
	
	@GetMapping(path = "api/produtos/{codigo}")
	public ProdutosModelo buscaPorId(@PathVariable("codigo") Integer codigo) {
		Optional<ProdutosModelo> produto = rep.findById(codigo);
		return produto.get();
	}
	
	@PostMapping(path = "api/produtos/salvar")
	public void salvar(@RequestBody ProdutosModelo pro) {
		rep.save(pro);
	}
	
	@DeleteMapping(path = "api/produtos/deletar/{codigo}")
	public void deletar(@PathVariable("codigo") Integer codigo) {
		try {
			rep.deleteById(codigo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@RequestMapping(path = "api/produtos/alterar")
	public void alterar(@RequestBody ProdutosModelo pro) {
		try {
			rep.save(pro);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
