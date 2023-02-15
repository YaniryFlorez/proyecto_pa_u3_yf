package com.example.demo1.service;

import java.util.List;

import com.example.demo1.modelo.Hotel;

public interface IHotelService {
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterRightJoin();

	public List<Hotel> buscarHotelOuterLefttJoin();

	public List<Hotel> buscarHotelOuterFulltJoin();
}
