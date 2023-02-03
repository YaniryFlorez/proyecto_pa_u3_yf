package com.example.demo1.repository;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RentaRepoImpl implements IRentaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(renta);
	}

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Renta.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Renta rent=this.buscar(id);
		this.entityManager.remove(rent);
		
	}

}
