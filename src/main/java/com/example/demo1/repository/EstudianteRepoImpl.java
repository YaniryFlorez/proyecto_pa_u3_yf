package com.example.demo1.repository;

import javax.management.Query;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		jpqlQuery.setParameter("datoNombre", nombre);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido", Estudiante.class);
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
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero", Estudiante.class);
		jpqlQuery.setParameter("datoGenero", genero);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad", Estudiante.class);
		jpqlQuery.setParameter("datoCiudad", ciudad);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		jakarta.persistence.Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula", Estudiante.class);
		jpqlQuery.setParameter("datoCedula", cedula);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQuryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante>myTypeQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class );
		myTypeQuery.setParameter("datoNombre", nombre);
	    return myTypeQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery= (Query) this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);
		return  (Estudiante )myQuery.setSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQuerytype(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante>myTypeQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class );
		myTypeQuery.setParameter("datoNombre", nombre);
		return myTypeQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery =(Query) this.entityManager.createNativeQuery("Estudiante.buscarPorNombre",Estudiante.class);
		((jakarta.persistence.Query) myQuery).setParameter("datoNombre", nombre);
		return  (Estudiante) myQuery.setSingleResult();
	}



	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNaimed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante>myQuery = this.entityManager.createNamedQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class );
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	


}
}
