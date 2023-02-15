package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Habitacion;
import com.example.demo1.modelo.Hotel;
import com.example.demo1.repository.IHabitacionRepo;

@Service
public class HabitacionServImpl implements IHotelService{
	
	@Autowired
	private IHabitacionRepo habitacionRep;
	private Object habitacionRepo;
	

	@Override
	public List<Habitacion> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRep.buscarHotelOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterLefttJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRep.buscarHotelOuterLefttJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterFulltJoin() {
		// TODO Auto-generated method stub
		return  ((IHabitacionRepo) this.habitacionRepo).buscarHotelOuterFulltJoin();
	}

}
