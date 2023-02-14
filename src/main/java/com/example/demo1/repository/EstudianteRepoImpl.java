package com.example.demo1.repository;

import java.util.List;

import javax.management.Query;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
    
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public Estudiante Eliminar(String ciudad) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query query = this.entityManager.createQuery(
				"DELETE  from Estudiante e  WHERE e.ciudad = :dateCiudad");
		query.setParameter("dateCiudad",ciudad);
		query.executeUpdate();
		return null;
	}

	@Override
	public Estudiante actualizar(String ciudad, String genero) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query query = this.entityManager.createQuery(
				"UPDATE Estudiante e set e.genero=: dateGenero WHERE e.ciudad = :dateCiudad");
		query.setParameter("dateCiudad",ciudad);
		query.setParameter("dateGenero", genero);
		query.executeUpdate();
		
		return null;
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}


	

}
