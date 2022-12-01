package com.api.food.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.api.food.domain.exception.EntidadeEmUsoException;
import com.api.food.domain.exception.EntidadeNaoEncontradaException;
import com.api.food.domain.model.Cozinha;
import com.api.food.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaSerivce {
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRepository.save(cozinha);
		
	}
	
	public void excluir(Long cozinhaId) {
		
		try {

			cozinhaRepository.deleteById(cozinhaId);
		}
		catch(EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe um cadastro de com código %d",
							cozinhaId));
		}
		catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Cozinha de código %d não pode ser removida,"
					+ "pois está em uso", cozinhaId));
		}
		}
}
