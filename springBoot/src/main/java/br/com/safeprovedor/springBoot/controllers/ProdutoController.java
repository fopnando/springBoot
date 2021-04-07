package br.com.safeprovedor.springBoot.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.safeprovedor.springBoot.model.entities.Produto;
import br.com.safeprovedor.springBoot.model.repositories.ProdutoRepository;
import br.com.safeprovedor.springBoot.routes.Rota;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping(Rota.FORMULARIO)
	public String form(){
		return "/formulario";
	}
	
	@PostMapping(Rota.CRIAR)
	public String novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return "redirect:/api/produtos/novo";
	}


	@GetMapping(Rota.LISTAR)
	public ModelAndView listarTodos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Produto> produtos = produtoRepository.findAll();
		mv.addObject("produtos", produtos);
		return mv;
	}
	
}
