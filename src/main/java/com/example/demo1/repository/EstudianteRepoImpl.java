package com.example.demo1.repository;

import javax.management.Query;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Estudiante;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TableGenerator;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
    
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void actualizar(Estudiante estudiante) {		// TODO Auto-generated method stub
		
	}

	@Override
	public Estudiante buscarNombreQuery(Estudiante estudiante) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre='edison'
		//selec from Estudiante e where e.nombre = : datoNombre
		Query jpqlQuery =  this.entityManager.createQuery("selec from Estudiante e where e.nombre = : datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		return null;
	}

	@Override
	public Estudiante buscarApellidoQuery(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
