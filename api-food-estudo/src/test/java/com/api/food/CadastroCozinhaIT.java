package com.api.food;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.food.domain.model.Cozinha;
import com.api.food.domain.service.CadastroCozinhaService;

@RunWith(SpringRunner.class)
@SpringBootTest
class CadastroCozinhaIT {
	
	@Autowired
	private CadastroCozinhaService cadastroCozinha;
	
	@Test
	public void deveAtribuirId_QuandoCadastrarCozinhaComDadosCorretos() {
		Cozinha novaCozinha = new Cozinha();
		novaCozinha.setNome("Chinesa");
		
		novaCozinha = cadastroCozinha.salvar(novaCozinha);
		
		assertThat(novaCozinha).isNotNull();
		assertThat(novaCozinha.getId()).isNotNull();
		
	}

	@Test
	public void deveFalhar_QuandoCadastrarCozinhaSemNome() {
		Cozinha novaCozinha = new Cozinha();
		novaCozinha.setNome(null);
		
		novaCozinha = cadastroCozinha.salvar(novaCozinha);
	}
	
	@Test
	public void deveFalhar_QuandoExcluirCozinhaEmUso() {
		cadastroCozinha.excluir(1L);
	}
	@Test
	public void deveFalhar_QuandoExcluirCozinhaInesxistente() {
		cadastroCozinha.excluir(100L);
	}
	

}
