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

import com.projeto.app.modelo.VendasModelo;
import com.projeto.app.repositorio.VendasRepositorio;

@RestController 
public class VendasControle {
	@Autowired
	VendasRepositorio rep;
	
	@GetMapping(path = "api/vendas") 
	public List<VendasModelo> buscar() {
		return rep.findAll();
	}
	
	@GetMapping(path = "api/vendas/{codigo}")
	public VendasModelo buscaPorId(@PathVariable("codigo") Integer codigo) {
		Optional<VendasModelo> venda =  rep.findById(codigo);
		return venda.get();
	}
	
	@PostMapping(path = "api/vendas/salvar")
	public void salvar(@RequestBody VendasModelo ven ) {
		rep.save(ven);
	}
	
	@DeleteMapping(path = "api/vendas/deletar/{codigo}")
	public void deletar(@PathVariable("codigo") Integer codigo) {
		try {
			rep.deleteById(codigo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@RequestMapping(path = "api/vendas/alterar")
	public void alterar(@RequestBody VendasModelo ven) {
		try {
			rep.save(ven);
		} catch (Exception e) {
			System.out.println(e.getMessage());
}
	}
}
