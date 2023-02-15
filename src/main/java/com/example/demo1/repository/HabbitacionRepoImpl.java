package com.example.demo1.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Habitacion;
import com.example.demo1.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class HabbitacionRepoImpl implements IHabitacionRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
        Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Right JOIN h.habitaciones ha ", Habitacion.class);
	
		return myQuery.getResultList();
		
	}

	@Override
	public List<Habitacion> buscarHotelOuterLefttJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Left JOIN h.habitaciones ha ", Habitacion.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> buscarHotelOuterFulltJoin() {
		// TODO Auto-generated method stub
     Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h FULL JOIN h.habitaciones ha ", Habitacion.class);
		
		return myQuery.getResultList();
	}

}
