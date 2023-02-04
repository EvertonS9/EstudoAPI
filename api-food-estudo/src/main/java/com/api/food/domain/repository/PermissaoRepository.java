package com.api.food.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.food.domain.model.FormaPagamento;
import com.api.food.domain.model.Grupo;
import com.api.food.domain.model.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
