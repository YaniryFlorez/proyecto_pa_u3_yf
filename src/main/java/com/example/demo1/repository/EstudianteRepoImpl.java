package com.example.demo1.repository;

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
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub

		// select * from estudiante where estu_nombre = 'nombre'
		// select e from Estudiante e where e.nombre = : datoNombre
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}



}
