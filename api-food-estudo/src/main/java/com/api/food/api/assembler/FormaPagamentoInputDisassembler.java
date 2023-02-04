package com.api.food.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.food.domain.model.FormaPagamento;
import com.api.food.model.input.FormaPagamentoInput;

@Component
public class FormaPagamentoInputDisassembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public FormaPagamento toDomainObject(FormaPagamentoInput formaPagamentoInput) {
		return modelMapper.map(formaPagamentoInput, FormaPagamento.class);
	}
	
	public void copyToDomainObject(FormaPagamentoInput formaPagamentoInput, FormaPagamento formaPagamento) {
		modelMapper.map(formaPagamentoInput, formaPagamento);
	}
	
}