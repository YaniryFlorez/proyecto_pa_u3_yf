package com.example.demo1.repository;

import java.util.List;

import com.example.demo1.modelo.Habitacion;
import com.example.demo1.modelo.Hotel;

public interface IHabitacionRepo {
	
	public List<Habitacion> buscarHotelOuterRightJoin();

	public List<Habitacion> buscarHotelOuterLefttJoin();

	public List<Habitacion> buscarHotelOuterFulltJoin();

}
