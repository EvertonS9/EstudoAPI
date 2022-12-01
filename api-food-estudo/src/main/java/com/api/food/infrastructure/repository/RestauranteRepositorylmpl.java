package com.api.food.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.api.food.domain.model.Restaurante;
import com.api.food.domain.repository.RestauranteRepository;

@Component
public class RestauranteRepositorylmpl implements RestauranteRepository{
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Restaurante> listar(){
		return manager.createQuery("from Restaurante", Restaurante.class)
				.getResultList();
	}
	
	public Restaurante buscar(Long id) {
		return manager.find(Restaurante.class, id);
				
	}
	
	@Transactional
	public Restaurante salvar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}
	
	public void remover(Restaurante restaurante) {
		restaurante = buscar(restaurante.getId());
		manager.remove(restaurante);
	}
}
