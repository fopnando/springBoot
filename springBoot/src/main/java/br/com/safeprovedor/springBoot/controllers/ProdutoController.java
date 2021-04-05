package br.com.safeprovedor.springBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.safeprovedor.springBoot.model.entities.Produto;
import br.com.safeprovedor.springBoot.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		
		return produto;
	}

}
