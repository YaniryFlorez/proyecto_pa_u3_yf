package com.example.demo1.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha.tipo =:datoTipo ", Hotel.class);
		myQuery.setParameter("", tipoHabitacion);
		List<Hotel> list = myQuery.getResultList();
		list.forEach(a -> a.getHabitaciones().size());
		return list;
	
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Right JOIN h.habitaciones ha.tipo =:datoTipo ", Hotel.class);
		myQuery.setParameter("", tipoHabitacion);
		List<Hotel> list = myQuery.getResultList();
		list.forEach(a -> a.getHabitaciones().size());
		return list;
	}

	@Override
	public List<Hotel> buscarHotelOuterLefttJoin(String tipoHabitacion) {
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Left JOIN h.habitaciones ha.tipo =:datoTipo ", Hotel.class);
		myQuery.setParameter("", tipoHabitacion);
		List<Hotel> list = myQuery.getResultList();
		list.forEach(a -> a.getHabitaciones().size());
		return list;
	}

	@Override
	public List<Hotel> buscarHotelOuterFulltJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Left JOIN FETCH h.habitaciones ha.tipo =:datoTipo ", Hotel.class);
		myQuery.setParameter("", tipoHabitacion);
		List<Hotel> list = myQuery.getResultList();
		
		return list;
		
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Right JOIN FETCH h.habitaciones ", Hotel.class);
		
		return null;
	}

	@Override
	public List<Hotel> buscarHotelOuterLefttJoin() {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Letf JOIN FETCH h.habitaciones ", Hotel.class);
        List<Hotel> list = myQuery.getResultList();
        
		
		return null;
	}

	@Override
	public List<Hotel> buscarHotelOuterFulltJoin() {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h Full JOIN FETCH h.habitaciones ", Hotel.class);

		
		return null;
	}

}
