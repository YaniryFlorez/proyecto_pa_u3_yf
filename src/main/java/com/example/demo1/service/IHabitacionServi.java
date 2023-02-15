package com.example.demo1.service;

import java.util.List;

import com.example.demo1.modelo.Habitacion;

public interface IHabitacionServi {

	public List<Habitacion> buscarHotelOuterRightJoin();

	public List<Habitacion> buscarHotelOuterLefttJoin();

	public List<Habitacion> buscarHotelOuterFulltJoin();

}
