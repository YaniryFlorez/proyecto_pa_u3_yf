package com.example.demo1.repository;

import java.util.List;

import com.example.demo1.modelo.Hotel;

public interface IHotelRepo {
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	

	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterLefttJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterFulltJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);
	

	public List<Hotel> buscarHotelOuterRightJoin();

	public List<Hotel> buscarHotelOuterLefttJoin();

	public List<Hotel> buscarHotelOuterFulltJoin();

	


}
