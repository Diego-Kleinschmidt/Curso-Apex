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

import com.projeto.app.modelo.FuncionariosModelo;
import com.projeto.app.repositorio.FuncionariosRepositorio;

@RestController
public class FuncionariosControle {
	
	@Autowired
	FuncionariosRepositorio rep;
	
	@GetMapping(path = "api/funcionarios")
	public List<FuncionariosModelo> buscar(){
		return rep.findAll();
	}
	
	@GetMapping(path = "api/funcionarios/{codigo}")
	public FuncionariosModelo buscarPorId(@PathVariable("codigo") Integer codigo) {
		Optional<FuncionariosModelo> funcionario = rep.findById(codigo);
		return funcionario.get();
	}
	
	@PostMapping(path = "api/funcionarios/salvar")
	public void salvar(@RequestBody FuncionariosModelo fun) {
		rep.save(fun);
	}
	
	@DeleteMapping(path = "api/funcionarios/deletar/{codigo}")
	public void deletar (@PathVariable("codigo") Integer codigo) {
		try {
			rep.deleteById(codigo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@RequestMapping(path = "api/funcionarios/alterar")
	public void alterar (@RequestBody FuncionariosModelo fun) {
		try {
			rep.save(fun);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
