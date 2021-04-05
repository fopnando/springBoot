package br.com.safeprovedor.springBoot.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.safeprovedor.springBoot.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	

}
