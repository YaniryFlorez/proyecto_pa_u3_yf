package com.example.demo1.repository;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Cliente client=this.buscar(cedula);
		this.entityManager.remove(client);
		
	}
	

}
