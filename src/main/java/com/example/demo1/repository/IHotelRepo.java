package com.example.demo1.repository;

import java.util.List;

import com.example.demo1.modelo.Hotel;

public interface IHotelRepo {
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
}
