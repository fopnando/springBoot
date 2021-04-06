package br.com.safeprovedor.springBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.safeprovedor.springBoot.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
	    
		return new Cliente(28, "Pedro", "123.456.789-00");
		
	}
	
	
	//http://localhost:8080/clientes/500
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.987.528-00");
		
	}
	
	
	//http://localhost:8080/clientes?id=500
	@GetMapping
	public Cliente obterClientePorId2(
			  @RequestParam(name = "id") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-44");
		
	}

}
