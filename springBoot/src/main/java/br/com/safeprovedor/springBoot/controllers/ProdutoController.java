package br.com.safeprovedor.springBoot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.safeprovedor.springBoot.model.entities.Produto;
import br.com.safeprovedor.springBoot.model.repositories.ProdutoRepository;

@Controller
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping(value="/novo")
	public String form(){
		return "/formulario";
	}
	
	@PostMapping(value = "/novo")
	public String novoProduto(Produto produto) {
		produtoRepository.save(produto);
		return "redirect:/api/produtos/novo";
	}
	
	@GetMapping("/todos")
	public List<Produto> todosProduto() {
		List<Produto> produtos = new ArrayList<>();
		produtos = (List<Produto>) produtoRepository.findAll();
		return produtos;
	}

}
