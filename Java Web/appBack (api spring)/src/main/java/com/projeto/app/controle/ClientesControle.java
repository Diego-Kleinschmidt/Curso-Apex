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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.app.modelo.ClientesModelo;
import com.projeto.app.repositorio.ClientesRepositorio;

@RestController // define essa classe como restControler
				//assim ele vai buscar pelos GetMapping atras das urls do http
public class ClientesControle {
	@Autowired
	ClientesRepositorio rep;
	
	@GetMapping(path = "api/clientes") //Mapeia o HTTP do metodo
	public List<ClientesModelo> buscar() {
		return rep.findAll();
	}
	
	@GetMapping(path = "api/clientes/{codigo}")
	public ClientesModelo buscaPorId(@PathVariable("codigo") Integer codigo) {
		Optional<ClientesModelo> cliente =  rep.findById(codigo);
		return cliente.get();
	}
	
	@PostMapping(path = "api/clientes/salvar")
	public void salvar(@RequestBody ClientesModelo cli ) {
		rep.save(cli);
	}
	
	@DeleteMapping(path = "api/clientes/deletar/{codigo}")
	public void deletar(@PathVariable("codigo") Integer codigo) {
		try {
			rep.deleteById(codigo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@RequestMapping(path = "api/clientes/alterar", method = RequestMethod.PUT)
	public void alterar(@RequestBody ClientesModelo cli) {
		try {
			rep.save(cli);
		} catch (Exception e) {
			System.out.println(e.getMessage());
}
	}
}
