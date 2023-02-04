package com.api.food.domain.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.food.domain.exception.ProdutoNaoEncontradoException;
import com.api.food.domain.model.Produto;
import com.api.food.domain.repository.ProdutoRepository;

@Service
public class CadastroProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Transactional
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto buscarOuFalhar(Long restauranteId, Long produtoId) {
		return produtoRepository.findById(restauranteId, produtoId)
			.orElseThrow(() -> new ProdutoNaoEncontradoException(restauranteId, produtoId));
	}
	
}
